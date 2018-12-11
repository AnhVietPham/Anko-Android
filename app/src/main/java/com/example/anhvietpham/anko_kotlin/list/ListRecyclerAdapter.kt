package com.example.anhvietpham.anko_kotlin.list

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.util.TimingLogger
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.anhvietpham.anko_kotlin.R
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find

class ListRecyclerAdapter(val context: Context) : RecyclerView.Adapter<ListRecyclerAdapter.ListViewHolder>() {
    private val listInfo: MutableList<DataModel> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val timings = TimingLogger("ListRecyclerAdapter","onCreateViewHolder")
        val itemView = AnkoViewHolderListUI().createView(AnkoContext.create(parent.context, parent))
        timings.addSplit("onCreateViewHolder done")
        timings.dumpToLog()
        return ListViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listInfo.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(
            listInfo[position].name,
            listInfo[position].lastName,
            listInfo[position].image
        )
    }

    fun updateList(contacts: MutableList<DataModel>) {
        this.listInfo.clear()
        this.listInfo.addAll(contacts)
        notifyDataSetChanged()
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var listCard: ConstraintLayout = itemView.find(R.id.list_card)
        private var profileText: TextView = itemView.find(R.id.profile_text_viewholder)
        private val profileImage: ImageView = itemView.find(R.id.profile_circle_image_viewholder)
        fun bind(name: String, surname: String, image: Int){
            profileText.text = "$name $surname"
            profileImage.setImageResource(image)
        }
    }
}