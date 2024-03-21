package com.example.fragmentdeneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.fragmentdeneme.databinding.Fragment1Binding
import com.example.fragmentdeneme.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    private lateinit var binding: Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=Fragment2Binding.inflate(inflater,container,false)

        val bundle:Fragment2Args by navArgs()
        val gelenAd=bundle.ad
        val gelenYas=bundle.yas
        val gelenBoy=bundle.boy
        val gelenBekar=bundle.bekar

        val gelenUrunAd= bundle.urun.ad
        val gelenUrunId=bundle.urun.id

        binding.textView.text="$gelenAd - $gelenBekar - $gelenBoy - $gelenYas - $gelenUrunAd - $gelenUrunId"
        return binding.root
    }
}