import com.sun.deploy.net.MessageHeader.merge

data class Datas(
    val id: Int,
    val name: String,
    val phone: String,
    val email: String,
    val address: String
)

val listData = listOf(
    Datas(
        1,
        "SMG02_IZOS CELL_197738",
        "8996341493",
        "smg@mail.com",
        ""
    ),
    Datas(
        2,
        "wsssasshshshs",
        "85846844569",
        "herna@haha.com",
        "jwjsjsnshshss"
    ),
    Datas(
        3,
        "Wano",
        "8132263555",
        "wano@yahoo.com",
        ""
    ),
    Datas(
        4,
        "WWW",
        "813221639223",
        "merlin@hotmail.com",
        "Sepanjang jalanan, kita melaju cepat."
    ),
    Datas(
        5,
        "Wre",
        "85222333666",
        "darlihh@gmail.comr",
        ""
    ),
    Datas(
        6,
        "Wenas",
        "856663963",
        "darma@gmail.com",
        "di atas awan yang tenangg"
    ),
    Datas(
        7,
        "jonitbshshshshshshhshshsdhddhhd",
        "822255566697",
        "darnu@gmail.com",
        "kwkwkwwkaagg"
    ),
    Datas(
        8,
        "joni jino jini",
        "8123456789",
        "joni@mail.com",
        "jl gambir gambir"
    ),
    Datas(
        9,
        "test",
        "82117222140",
        "test@mailing.com",
        ""
    ),
    Datas(
        10,
        "joni jini jino",
        "8159159156",
        "joni@mail.com",
        ""
    ),
    Datas(
        11,
        "jes",
        "8147158159",
        "jes.mail@mail.com",
        ""
    ),
    Datas(
        12,
        "hess",
        "8154979988",
        "",
        "Jalan jaaln menuju langit biru"
    ),
    Datas(
        13,
        "aldyaz",
        "825369741",
        "aldyaz@gmail.com",
        ""
    ),
    Datas(
        14,
        "ujang",
        "8217753855",
        "ujang@hotmail.com",
        "Jalan kujang raya"
    ),
    Datas(
        15,
        "joni",
        "8127576769",
        "joni2@gmail.com",
        ""
    ),
    Datas(
        16,
        "jini",
        "8157597979",
        "",
        ""
    ),
    Datas(
        17,
        "joni",
        "821457555",
        "joni@hotmail.com",
        ""
    ),
    Datas(
        18,
        "ujang jang",
        "82124543464",
        "",
        "Jalan kenanga"
    ),
    Datas(
        19,
        "sellfazz",
        "821472588",
        "",
        "Jalan fazz"
    ),
    Datas(
        20,
        "ujang",
        "851212121",
        "ujang@hotmail.com",
        "Jl ujung ujang"
    ),
)

fun main() {
//    nameLess5Letters()
//    dataHasAddressAndEmail()
//    dataHotmailAndMail()
//    filter()
//    noEmailSortEmail()

}

fun nameLess5Letters() {
    println("1. Sortir data nama kurang dari 5 huruf:")
    listData.forEach {
        if (it.name.length < 5) {
            println(it)
        }
    }
}

fun dataHasAddressAndEmail() {
    println("\n2. Memiliki alamat email dan sort name:")
    var data = listData.sortedWith(compareBy { it.name })
    data.forEach {
        if (it.address.length > 1 && it.email.length > 1) {
            println(it)
        }
    }
}

fun dataHotmailAndMail() {
    println("\n3. Memiliki email @hotmail dan @mail:")
    for(item in listData.filter { it.email.contains("@mail") || it.email.contains("@hotmail") }){
        println(item)
    }
}

fun filter() {
    println("\n4. Sortir berdasarkan email dan alamat:")
    var data = listData.sortedWith(compareBy({ it.email }, { it.address }) )
    data.forEach {
        if (it.email.length > 3 && it.name.length > 3 && it.address.contains("Jalan")) {
            println(it)
        }
    }
}

fun noEmailSortEmail() {
    println("\n5. Sortir yang tidak memiliki alamat dan email bukan mail.com, urutan berdasarkan email:")
    var data = listData.sortedWith(compareBy { it.email })
    var filter = data.filterNot { it.email.contains("@mail.com") }
    filter.forEach {
        if (it.address.isEmpty()) {
            println(it)
        }
    }
}
