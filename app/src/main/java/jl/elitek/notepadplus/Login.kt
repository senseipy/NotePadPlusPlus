package jl.elitek.notepadplus


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*
import org.w3c.dom.EntityReference

/**
 * A simple [Fragment] subclass.
 */
class Login : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val str:String = "Hola Jefe!"
        btnInicioSesion.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_jefeInicio)
        }
        btnEmpleado.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_empleadoInicio)
        }
    }

}
