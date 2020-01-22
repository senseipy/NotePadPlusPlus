package jl.elitek.notepadplus


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_crear_proyecto.*
import kotlinx.android.synthetic.main.fragment_empleado_inicio.*

/**
 * A simple [Fragment] subclass.
 */
class EditarTarea : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_editar_tarea, container, false)
    }



}
