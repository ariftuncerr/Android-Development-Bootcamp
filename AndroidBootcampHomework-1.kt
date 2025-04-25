import java.time.LocalDate
import java.util.Date

fun main(){
    val city : String = "Trabzon"
    val country : String = "Türkiye"
    val phoneNumber : Int = 500123123
    val email : String = "arif@gmail.com"
    val job : String = "Computer Engineering"
    val stockAmount : Int = 1000
    val clientName : String = "Arif Tunçer"
    val balance : Double = 1000.3
    val birthDate : String = "01.01.2000"
    val maritalStatus : String = "Evli"
    val productComment : String = "harika bir ürün"
    val paymentData : String = "30.04.2025"
    val payment : Boolean = true
    val orderAmount : Int = 10
    val bookName : String = "Körlük- Jose Saramago"
    val discountAmount : Int = 12
    val carModel : String = "Ford Focus"
    val publishingDate : String = "10.10.2024"
    val numberOfRooms : Int = 10
    val lang : Double = 10.1
    val lat : Double = 10.3
    val productName : String = "Defter"
    val foodPrice : Double = 100.2
    val brand : String = "Nike"
    val musicName : String = "Exmpmusic"
    val videoTime : Double = 122.1
    val productRate : Int = 6
    val imageName : String = "image1"
    val fileFormat : String = "jpeg"
    val color : String = "Mavi"
    val phoneModel : String = "İphone"
    val screenSize : String = "16*9"
    val weight : Double = 99.9
    val nationalDay : String = "23 Nisan Ulusal Egemenlik ve Çocuk Bayarmı"
    val dayOfHoliday : String = "12.06.2025"
    val reservationDate : String = "01.07.2025"
    val streetName : String = "Tunç Sok."
    val busLine : String = "safranbolu-karabük"
    val remainingTime : String = "10.23"
    val followingCode : Int = 123
    val couponTime : Int  = 10
    val couponCode : String = "qwer12"
    val billDate : String = "12.12.2024"

    val list = listOf(
        billDate,birthDate,busLine,brand,bookName,clientName,city,couponCode,color,country,carModel,
        couponTime,discountAmount,dayOfHoliday,email,imageName,job,lat,lang,musicName,maritalStatus,
        nationalDay,numberOfRooms,orderAmount,phoneNumber,phoneModel,payment,paymentData,productComment,
        streetName,reservationDate,weight,screenSize,balance,videoTime,productName,publishingDate,
        productRate,followingCode,fileFormat,foodPrice,stockAmount,remainingTime
    )
    for(element in list){
        println(element)
    }





}