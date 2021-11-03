package com.neppplus.listview_20211103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listview_20211103.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( StudentData( "조경진",1988, "서울시 동대문구" ))
        mStudentList.add( StudentData( "김민성",1998, "서울시 도봉구" ))
        mStudentList.add( StudentData( "김준기",1996, "경기도 남양주시" ))
        mStudentList.add( StudentData( "방우진",1983, "경기도 고양시" ))
        mStudentList.add( StudentData( "이아현",1996, "서울시 동대문구" ))
        mStudentList.add( StudentData( "이지원",1993, "서울시 동대문구" ))


    }
}