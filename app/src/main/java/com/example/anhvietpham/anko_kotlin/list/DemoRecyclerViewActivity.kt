package com.example.anhvietpham.anko_kotlin.list

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.anhvietpham.anko_kotlin.R
import org.jetbrains.anko.setContentView

class DemoRecyclerViewActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    private lateinit var listRecyclerAdapter: ListRecyclerAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private var listDataModel: MutableList<DataModel> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoFragmentListUI().setContentView(this)
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        listDataModel.add(DataModel(
            name = "Anh Viet Pham",
            lastName = "ChelseaBoy",
            image = R.drawable.circle
        ))
        recyclerView = findViewById(R.id.list_recycler_view_anko)
        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        listRecyclerAdapter = ListRecyclerAdapter(this)
        listRecyclerAdapter.updateList(contacts = listDataModel)
        recyclerView.adapter = listRecyclerAdapter
    }
}