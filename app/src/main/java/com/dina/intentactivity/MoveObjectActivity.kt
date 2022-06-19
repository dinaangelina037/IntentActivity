package com.dina.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dina.intentactivity.databinding.ActivityMoveObjectBinding

class MoveObjectActivity : AppCompatActivity() {

    lateinit var  binding: ActivityMoveObjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoveObjectBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        Terima DATA
        val siswa = intent.getParcelableExtra<Siswa>("SIS")

        if (siswa != null) {
            binding.tvNama.text = siswa.nama
            binding.tvUmur.text = siswa.umur.toString()
            binding.tvTinggi.text = siswa.tinggi.toString()
            binding.tvGender.text = siswa.gender.toString()
            binding.tvLulus.text = if (siswa.lulus) "lulus" else "Belum Lulus"
        }
    }
}