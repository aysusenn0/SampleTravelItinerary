package com.aysusen.kotlinlandmarkbook

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.aysusen.kotlinlandmarkbook.databinding.ActivityMainBinding
val chosenLandMark:LandMark?=null
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList:ArrayList<LandMark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList= ArrayList<LandMark>()

        val cinarAlti=LandMark("Tepeköy Çınaraltı ","Tepeköy Çınaraltı, Gökçeada gezinizde mutlaka uğramanız gereken; hem doğanın hem tarihin kucaklaştığı huzurlu bir açık hava salonudur. Sinematik çınarı, yemekleri, muazzam manzarası ile uzun sohbetlere ve dinlendirici anlara davet eder.",R.drawable.tepekoy)
        val kalekoyKalesi=LandMark("Kale Köyü","Kaleköy, tarih, doğa ve Ege-Akdeniz yaşam tarzını bir arada sunan; güneşli gün batımları, antik kalıntılar ve deniz kenarındaki canlı atmosferiyle Gökçeada gezilerinin olmazsa olmazıdır.",R.drawable.kalekoy)
        val lazKoyu=LandMark("Laz Koyu","Laz Koyu, Gökçeada’nın Uğurlu Köyü yakınlarında yer alan, ince kumlu ve berrak deniziyle ünlü sakin bir koydur. Türkiye’nin en batı noktalarından biri olduğu için gün batımı manzarası muhteşemdir. Çevresinde tesis yoktur; tamamen doğal kalmıştır. Sessizlik, huzur ve doğayla baş başa kalmak isteyenlerin mutlaka uğraması gereken yerlerden biridir.",R.drawable.lazkoyu)
        val gizlimagara=LandMark("Gizli Magara","Gizli Mağara, Gökçeada’daki Gizli Liman koyunun hemen yanında, Uğurlu Köyü yakınlarında deniz seviyesinden az yükseklikteki bir kayalık içinde yer alır. Sahile kıyısının hemen kenarında bulunduğu için tekneyle ulaşım oldukça kolaydır .",R.drawable.gizlimagara)
        landmarkList.add(cinarAlti)
        landmarkList.add(kalekoyKalesi)
        landmarkList.add(lazKoyu)
        landmarkList.add(gizlimagara)
/*
        var adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark->landmark.name })
        binding.listView.adapter=adapter
        binding.listView.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val intent=Intent(MainActivity@this,DetailsActivity::class.java)
                intent.putExtra("landmark",landmarkList.get(i))
                //intent.putExtra("landmark",landmarkList.get(i).name)
                startActivity(intent) }
*/
        binding.recyclerView.layoutManager= LinearLayoutManager(this)
        val landMarkAdapter=LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=landMarkAdapter

        }
    }

