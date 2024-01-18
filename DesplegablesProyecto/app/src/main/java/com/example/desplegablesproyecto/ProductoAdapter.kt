package com.example.desplegablesproyecto

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.

class ProductoAdapter(private val mContext : Context, private val listaproductos: List<Producto>) : ArrayAdapter<Producto>(mContext, 0, listaproductos) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_producto, parent, false)

        val producto = listaproductos[position]

        layout.nombre.text

        return layout
    }
}