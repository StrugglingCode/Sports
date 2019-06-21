package com.example.sports

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.sport_item.view.*
import java.util.zip.Inflater

class SportAdapter:BaseAdapter {

    private  var context:Context? = null
    private var sportDatabase:SportDatabase?=null

    constructor(context: Context)
    {
        this.context = context
        sportDatabase = SportDatabase()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
var sport:Sport = sportDatabase?.sportList?.get(position) ?: Sport("No Name","No Details",R.id.image)
         var inflater= context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
         var sportItem = inflater.inflate(R.layout.sport_item,null)

        sportItem.sport_image.setImageResource(sport._sportImage ?:R.drawable.placeholder)
        sportItem.sport_textView.setText(sport._sportName)

        sportItem.setOnClickListener {

            val intent = Intent(context,SportDetails::class.java)
            intent.putExtra("image",sport._sportImage)
            intent.putExtra("details",sport._sportDetail)
            ContextCompat.startActivity(context!!,intent,null)

        }

        return sportItem

    }

    override fun getItem(position: Int): Any {
        return sportDatabase?.sportList?.get(position) ?: Sport("No Name","No Details",R.id.image)


            }

    override fun getItemId(index: Int): Long {                     //index of sport objects

return index.toLong()
    }

    override fun getCount(): Int {
      return sportDatabase?.sportList?.size ?: 0

    }


}