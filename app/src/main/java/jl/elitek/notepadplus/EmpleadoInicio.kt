package jl.elitek.notepadplus


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_empleado_inicio.*

/**
 * A simple [Fragment] subclass.
 */
class EmpleadoInicio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_empleado_inicio, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnEditarTarea.setOnClickListener {
            findNavController().navigate(R.id.action_empleadoInicio_to_editarTarea)
        }
    }


}
