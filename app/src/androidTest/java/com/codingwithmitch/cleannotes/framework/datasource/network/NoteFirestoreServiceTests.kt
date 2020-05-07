package com.codingwithmitch.cleannotes.framework.datasource.network

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings

class NoteFirestoreServiceTests {


    val firestoreSettings = FirebaseFirestoreSettings.Builder()
        .setHost("10.0.2.2:8080")
        .setSslEnabled(false)
        .setPersistenceEnabled(false)
        .build()

    val firestore = FirebaseFirestore.getInstance()

    init {
        firestore.firestoreSettings = firestoreSettings
    }
}













