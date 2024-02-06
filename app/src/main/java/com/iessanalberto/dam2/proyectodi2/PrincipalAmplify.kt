package com.iessanalberto.dam2.proyectodi

import android.app.Application
import android.util.Log
import com.amplifyframework.AmplifyException
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin
import com.amplifyframework.core.Amplify

class PrincipalAmplify : Application() {
    override fun onCreate() {
        super.onCreate()
        try{
            Amplify.addPlugin(AWSCognitoAuthPlugin())
            Log.i("MyCognitoApp","Intitialized Cognito")
        }catch (ex: AmplifyException){
            Log.e("MyCogintoApp", "Could not initialize Cognito", ex)
        }
        try {
            Amplify.configure(applicationContext)
            Log.i("ProyectoDI", "Initialized Amplify")
        } catch (ex: AmplifyException) {
            Log.e("ProyectoDI", "Could not initialize Amplify", ex)
        }
    }
}