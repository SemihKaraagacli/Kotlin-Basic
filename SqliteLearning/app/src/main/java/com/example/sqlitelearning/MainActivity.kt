package com.example.sqlitelearning

import android.content.Context
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sqlitelearning.databinding.ActivityMainBinding
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        try {
            val database=this.openOrCreateDatabase( "Products", Context.MODE_PRIVATE,null)
            database.execSQL("CREATE TABLE IF NOT EXISTS products(id INTEGER PRIMARY KEY, name VARCHAR, price INT)")
            //database.execSQL("INSERT INTO products (name, price) VALUES('Shoes',100)")
//            database.execSQL("INSERT INTO products (name, price) VALUES('T-shirt',200)")
//            database.execSQL("INSERT INTO products (name, price) VALUES('Socks',50)")
//            database.execSQL("INSERT INTO products (name, price) VALUES('Pant',150)")
//            database.execSQL("INSERT INTO products (name, price) VALUES('Sweatshirt',100)")
//            database.execSQL("INSERT INTO products (name, price) VALUES('Scarf',20)")

//            database.execSQL("DELETE  FROM products WHERE id=5")
            database.execSQL("UPDATE products SET price= 300 WHERE name='Shoes'")

            val cursor=database.rawQuery("SELECT * FROM products",null)
//            val cursor=database.rawQuery("SELECT * FROM products WHERE name='Scarf'",null)
//            val cursor=database.rawQuery("SELECT * FROM products WHERE id=2",null)
//            val cursor=database.rawQuery("SELECT * FROM products WHERE name LIKE 'S%'",null)

            val idColumnIndex=cursor.getColumnIndex("id")
            val nameColumnIndex=cursor.getColumnIndex("name")
            val priceColumnIndex=cursor.getColumnIndex("price")

            while (cursor.moveToNext()){
                println("ID: ${cursor.getInt(idColumnIndex)}")
                println("Name: ${cursor.getString(nameColumnIndex)}")
                println("Price: ${cursor.getInt(priceColumnIndex)}")
            }
            cursor.close()

        }catch (e:Exception){
            e.printStackTrace()
        }
    }
}