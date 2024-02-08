package com.iessanalberto.dam2.proyectodi2

import com.iessanalberto.dam2.proyectodi2.viewmodels.RegisterScreenViewModel
import org.junit.Test
import org.junit.Assert.*

/**
 * Conjunto de pruebas unitarias utilizando el framework JUnit para realizar las pruebas pertinentes,
 * que evaluan el comportamiento de RegisterScreenViewModel en diferentes escenarios.
 */



//Tests unitarios para RegisterScreen
class RegisterScreenTestsUnitarios {
    //Inicialización del ViewModel para ser utilizado en las pruebas
    val viewModel = RegisterScreenViewModel()



    /**
     * Prueba para campos vacíos.
     * Se espera que el método registrarUsuario devuelva 1.
     */
    @Test
    fun camposVacios() {

        viewModel.onChanged(
            "",
            "",
            "",
            "")
        assertEquals(1, viewModel.registrarUsuario())
    }

    /**
     * Prueba para campo correo mayor de 30 carácteres.
     * Se espera que el método registrarUsuario devuelva 2.
     */
    @Test
    fun emailLargo() {
        viewModel.onChanged(
            "correoe@jemploiessanalbertomagno.com",
            "correoe@jemploiessanalbertomagno.com",
            "Ab@1234567","Ab@1234567")
        assertEquals(2, viewModel.registrarUsuario())
    }

    /**
     * Prueba para campo correo sin @
     * Se espera que el método registrarUsuario devuelva 3.
     */
    @Test
    fun emailSinArroba() {
        viewModel.onChanged(
            "correoejemplo.com",
            "correoejemplo.com",
            "Ab@1234567",
            "Ab@1234567")
        assertEquals(3, viewModel.registrarUsuario())
    }

    /**
     * Prueba para campo contraseña menor de 9 carácteres.
     * Se espera que el método registrarUsuario devuelva 4.
     */
    @Test
    //Contraseña < 9 carácteres
    fun passwordCorta() {
        viewModel.onChanged(
            "correo@ejemplo.com",
            "correo@ejemplo.com",
            "Ab@1234","Ab@1234")
        assertEquals(4, viewModel.registrarUsuario())
    }

    /**
     * Prueba para campo contraseña mayor de 30 carácteres.
     * Se espera que el método registrarUsuario devuelva 5.
     */
    @Test
    fun passwordLarga() {
        viewModel.onChanged(
            "correo@ejemplo.com",
            "correo@ejemplo.com",
            "Ab@1234567891234567891234567898",
            "Ab@1234567891234567891234567898")
        assertEquals(4, viewModel.registrarUsuario())
    }

    /**
     * Prueba para campo contraseña sin símbolo @.
     * Se espera que el método registrarUsuario devuelva 5.
     */
    @Test
    fun passworsSinArroba() {
        viewModel.onChanged(
            "correo@ejemplo.com",
            "correo@ejemplo.com",
            "Ab12345678",
            "Ab12345678")
        assertEquals(5, viewModel.registrarUsuario())
    }

    /**
     * Prueba para campo contraseña sin símbolo letras mayúsculas.
     * Se espera que el método registrarUsuario devuelva 6.
     */
    @Test
    fun passworsSinMayus() {
        viewModel.onChanged(
            "correo@ejemplo.com",
            "correo@ejemplo.com",
            "ab@1234567","ab@1234567")
        assertEquals(6, viewModel.registrarUsuario())
    }

    /**
     * Prueba para campo contraseña sin letrass minúsculas.
     * Se espera que el método registrarUsuario devuelva 6.
     */
    @Test
    fun passworsSinMinus() {
        viewModel.onChanged(
            "correo@ejemplo.com",
            "correo@ejemplo.com",
            "AB@1234567",
            "AB@1234567")
        assertEquals(6, viewModel.registrarUsuario())
    }

    /**
     * Prueba para campos contraseña y confirmarContraseña no son iguales.
     * Se espera que el método registrarUsuario devuelva 7.
     */
    @Test
    fun noPasswordEquals() {

        viewModel.onChanged(
            "correo@ejemplo.com",
            "correo@ejemplo.com",
            "Ab@1234567",
            "Ac@1234567")
        assertEquals(7, viewModel.registrarUsuario())
    }

    /**
     * Prueba para campos usuario y correo no son iguales.
     * Se espera que el método registrarUsuario devuelva 8.
     */
    @Test
    //Correo y usuario no son iguales
    fun noEmailUserEquals() {

        viewModel.onChanged(
            "correo@ejemplo.com",
            "ejemplo@correo.com",
            "Ab@1234567",
            "Ab@1234567")
        assertEquals(8, viewModel.registrarUsuario())
    }
    /**
     * Prueba para todos los campos correctos.
     * Se espera que el método registrarUsuario devuelva 9.
     */
    @Test
    //Registro exitoso
    fun registroExitoso() {
        viewModel.onChanged(
            "correo@ejemplo.com",
            "correo@ejemplo.com",
            "Ab@1234567",
            "Ab@1234567"
        )
        assertEquals(9, viewModel.registrarUsuario())
    }
}

