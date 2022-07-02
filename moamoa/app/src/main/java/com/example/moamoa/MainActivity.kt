package com.example.moamoa

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.moamoa.MyModel
import com.example.moamoa.R
import com.example.umc_hackathon.MyRecyclerAdapter
import com.example.umc_hackathon.MyRecyclerviewInterface
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MyRecyclerviewInterface {

    val TAG: String = "log"

    // 데이터를 담을 그릇 즉 배열
    var modelList = ArrayList<MyModel>()
//    var recyclerView: View = findViewById<View>(R.id.my_recycler_view)

    private lateinit var myRecyclerAdapter: MyRecyclerAdapter

    // 뷰가 화면에 그려질때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 10번 반복한다.
        for (i in 1..10){
            val myModel = MyModel(title = "사회현상에 대한 소비자 인식 $i")
            this.modelList.add(myModel)
        }

        Log.d(TAG, "MainActivity - ${this.modelList.size}")

        // 어답터 인스턴스 생성
        myRecyclerAdapter = MyRecyclerAdapter(this)

        myRecyclerAdapter.submitList(this.modelList)

        // 리사이클러뷰 설정
        my_recycler_view.apply {

            // 리사이클러뷰 방향 등 설정
            this.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)

            // 어답터 장착
            this.adapter = this@MainActivity.myRecyclerAdapter

        }
    }

    override fun onItemClicked(position: Int) {
        Log.d(TAG, "position: " + position)
    }

    // 설문조사 작성 버튼
    fun onClick(v: View) {
        var intent: Intent = Intent(this, FormCreateActivity::class.java)
        startActivity(intent)
    }

}