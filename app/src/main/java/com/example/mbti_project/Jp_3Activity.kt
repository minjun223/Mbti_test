package com.example.mbti_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import kotlin.reflect.KClass

class Jp_3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jp3)

        val Jp3_1 : CheckBox = findViewById(R.id.Jp3_1)
        Jp3_1.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("j_3","j")
            for (i:Int in 1..12){
                var emptyList: List<String> = emptyList()
                emptyList = listOf(intent.getStringExtra("op").toString())

                var check : Int = 0
                var check2 : Int = 0
                var id1 : String =""
                var id2 : String=""
                var id3 : String = ""
                var id4 : String = ""
                if(i < 3 )
                {
                    if(emptyList.startsWith("e")){
                        check += 1
                    }
                    if(emptyList.startsWith("i")){
                        check2 += 1
                    }
                    if(check > check2){
                        id1 = "e"
                    }
                    else{
                        id1 = "i"
                    }
                }
                if( i < 6 || i>=3){
                    if(emptyList.startsWith("s")){
                        check += 1
                    }
                    if (emptyList.startsWith("n")){
                        check2 += 1
                    }
                    if(check > check2){
                        id2 = "s"
                    }
                    else{
                        id2 = "n"
                    }
                }
                if(i<9 || i>=6){
                    if(emptyList.startsWith("t")){
                        check += 1
                    }
                    if(emptyList.startsWith("f")){
                        check2 += 1
                    }
                    if(check > check2){
                        id3 = "t"
                    }
                    else if( check2 > check ){
                        id3 = "f"
                    }
                }
                if(i<12 || i>=9){
                    if(emptyList.startsWith("j")){
                        check += 1
                    }
                    if(emptyList.startsWith("p")){
                        check2 += 1
                    }
                    if(check > check2){
                        id4 = "j"
                    }
                    else{
                        id4 = "p"
                    }
                }
                if(id1=="e"&& id2=="n" && id3=="f" && id4=="j"){
                    val intent = Intent(this, ENFJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="n" && id3=="f" && id4=="p"){
                    val intent = Intent(this, ENFPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="n" && id3=="t" && id4=="j"){
                    val intent = Intent(this, ENTJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="n" && id3=="t" && id4=="p"){
                    val intent = Intent(this, ENTPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="s" && id3=="f" && id4=="j"){
                    val intent = Intent(this, ESFJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="s" && id3=="f" && id4=="p"){
                    val intent = Intent(this, ENTJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="s" && id3=="t" && id4=="j"){
                    val intent = Intent(this, ENTJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="s" && id3=="t" && id4=="p"){
                    val intent = Intent(this, ESTPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="n" && id3=="f" && id4=="j"){
                    val intent = Intent(this, INFJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="n" && id3=="f" && id4=="p"){
                    val intent = Intent(this, INFPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="n" && id3=="t" && id4=="j"){
                    val intent = Intent(this, INTJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="n" && id3=="t" && id4=="p"){
                    val intent = Intent(this, INTPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="s" && id3=="f" && id4=="j"){
                    val intent = Intent(this, ISFJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="s" && id3=="f" && id4=="p"){
                    val intent = Intent(this, ISFPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="s" && id3=="t" && id4=="j"){
                    val intent = Intent(this, ISTJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="s" && id3=="t" && id4=="p"){
                    val intent = Intent(this, ISTPActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        val Jp3_2 : CheckBox = findViewById(R.id.Jp3_2)
        Jp3_2.setOnClickListener{
            val intent = Intent(this, Jp_3Activity::class.java)
            intent.putExtra("p_3","p")

            for (i:Int in 1..12){
                var arrayList = arrayListOf<String>()
                arrayList.add(intent.getStringExtra().toString())
                var check : Int = 0
                var check2 : Int = 0
                var id1 : String =""
                var id2 : String=""
                var id3 : String = ""
                var id4 : String = ""

                if(i < 3 )
                {
                    if(arrayList.startsWith("e")){
                        check += 1
                    }
                    if(arrayList.startsWith("i")){
                        check2 += 1
                    }
                    if(check > check2){
                        id1 = "e"
                    }
                    else{
                        id1 = "i"
                    }
                }
                if( i < 6 || i>=3){
                    if(arrayList.startsWith("s")){
                        check += 1

                    }
                    if (arrayList.startsWith("n")){
                        check2 += 1

                    }
                    if(check > check2){
                        id2 = "s"
                    }
                    else{
                        id2 = "n"
                    }

                }
                if(i<9 || i>=6){
                    if(arrayList.startsWith("t")){
                        check += 1

                    }
                    if(arrayList.startsWith("f")){
                        check2 += 1
                    }
                    if(check > check2){
                        id3 = "t"
                    }
                    else if( check2 > check ){
                        id3 = "f"
                    }
                }
                if(i<12 || i>=9){
                    if(arrayList.startsWith("j")){
                        check += 1

                    }
                    if(arrayList.startsWith("p")){
                        check2 += 1
                    }
                    if(check > check2){
                        id4 = "j"
                    }
                    else{
                        id4 = "p"
                    }
                }

                if(id1=="e"&& id2=="n" && id3=="f" && id4=="j"){
                    val intent = Intent(this, ENFJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="n" && id3=="f" && id4=="p"){
                    val intent = Intent(this, ENFPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="n" && id3=="t" && id4=="j"){
                    val intent = Intent(this, ENTJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="n" && id3=="t" && id4=="p"){
                    val intent = Intent(this, ENTPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="s" && id3=="f" && id4=="j"){
                    val intent = Intent(this, ESFJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="s" && id3=="f" && id4=="p"){
                    val intent = Intent(this, ENTJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="s" && id3=="t" && id4=="j"){
                    val intent = Intent(this, ENTJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="e"&& id2=="s" && id3=="t" && id4=="p"){
                    val intent = Intent(this, ESTPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="n" && id3=="f" && id4=="j"){
                    val intent = Intent(this, INFJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="n" && id3=="f" && id4=="p"){
                    val intent = Intent(this, INFPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="n" && id3=="t" && id4=="j"){
                    val intent = Intent(this, INTJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="n" && id3=="t" && id4=="p"){
                    val intent = Intent(this, INTPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="s" && id3=="f" && id4=="j"){
                    val intent = Intent(this, ISFJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="s" && id3=="f" && id4=="p"){
                    val intent = Intent(this, ISFPActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="s" && id3=="t" && id4=="j"){
                    val intent = Intent(this, ISTJActivity::class.java)
                    startActivity(intent)
                }
                if(id1=="i"&& id2=="s" && id3=="t" && id4=="p"){
                    val intent = Intent(this, ISTPActivity::class.java)
                    startActivity(intent)
                }
            }

        }
        val button13 : Button = findViewById(R.id.button12)
        button13.setOnClickListener{

            var check : Int = 0
            var check2 : Int = 0
            var id1 : String =""
            var id2 : String=""
            var id3 : String = ""
            var id4 : String = ""
            for(i: Int in 1..12) {
                var emptyList: List<String> = arrayListOf<String>()
                emptyList = listOf(intent.getStringExtra("op").toString())
                if(i < 3 )
                {
                    if(emptyList.startsWith("e")){
                        check += 1
                    }
                    if(emptyList.startsWith("i")){
                        check2 += 1
                    }
                    if(check > check2){
                        id1 = "e"
                    }
                    else{
                        id1 = "i"
                    }
                }
                if( i < 6 || i>=3){
                    if(emptyList.startsWith("s")){
                        check += 1
                    }
                    if (emptyList.startsWith("n")){
                        check2 += 1
                    }
                    if(check > check2){
                        id2 = "s"
                    }
                    else{
                        id2 = "n"
                    }
                }
                if(i<9 || i>=6){
                    if(emptyList.startsWith("t")){
                        check += 1
                    }
                    if(emptyList.startsWith("f")){
                        check2 += 1
                    }
                    if(check > check2){
                        id3 = "t"
                    }
                    else if( check2 > check ){
                        id3 = "f"
                    }
                }
                if(i<12 || i>=9){
                    if(emptyList.startsWith("j")){
                        check += 1
                    }
                    if(emptyList.startsWith("p")){
                        check2 += 1
                    }
                    if(check > check2){
                        id4 = "j"
                    }
                    else{
                        id4 = "p"
                    }
                }
                if (id1 == "e" && id2 == "n" && id3 == "f" && id4 == "j") {
                    val intent = Intent(this, ENFJActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "e" && id2 == "n" && id3 == "f" && id4 == "p") {
                    val intent = Intent(this, ENFPActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "e" && id2 == "n" && id3 == "t" && id4 == "j") {
                    val intent = Intent(this, ENTJActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "e" && id2 == "n" && id3 == "t" && id4 == "p") {
                    val intent = Intent(this, ENTPActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "e" && id2 == "s" && id3 == "f" && id4 == "j") {
                    val intent = Intent(this, ESFJActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "e" && id2 == "s" && id3 == "f" && id4 == "p") {
                    val intent = Intent(this, ENTJActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "e" && id2 == "s" && id3 == "t" && id4 == "j") {
                    val intent = Intent(this, ENTJActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "e" && id2 == "s" && id3 == "t" && id4 == "p") {
                    val intent = Intent(this, ESTPActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "i" && id2 == "n" && id3 == "f" && id4 == "j") {
                    val intent = Intent(this, INFJActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "i" && id2 == "n" && id3 == "f" && id4 == "p") {
                    val intent = Intent(this, INFPActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "i" && id2 == "n" && id3 == "t" && id4 == "j") {
                    val intent = Intent(this, INTJActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "i" && id2 == "n" && id3 == "t" && id4 == "p") {
                    val intent = Intent(this, INTPActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "i" && id2 == "s" && id3 == "f" && id4 == "j") {
                    val intent = Intent(this, ISFJActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "i" && id2 == "s" && id3 == "f" && id4 == "p") {
                    val intent = Intent(this, ISFPActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "i" && id2 == "s" && id3 == "t" && id4 == "j") {
                    val intent = Intent(this, ISTJActivity::class.java)
                    startActivity(intent)
                }
                if (id1 == "i" && id2 == "s" && id3 == "t" && id4 == "p") {
                    val intent = Intent(this, ISTPActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
    private fun Intent(activity: MainActivity, kClass: KClass<Ei_Activity>): Intent? {
        TODO("Not yet implemented")
    }
    private fun <E> ArrayList<E>.startsWith(e: E): Boolean {
        TODO("Not yet implemented")
    }

    private fun Any.getStringExtra(): String? {
        TODO("Not yet implemented")
    }
    private fun <E> List<E>.startsWith(e: E): Boolean {
        TODO("Not yet implemented")
    }
}






