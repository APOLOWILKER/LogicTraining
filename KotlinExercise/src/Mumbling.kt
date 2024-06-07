val string = "ZpglnRxqenU"
    "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu"
val string2 = "NyffsGeyylB"
    "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb"

class Mumbling {

    fun accum(s:String):String {
        println(s)

        val convert = s.toCharArray().mapIndexed { index, char ->
            char.toString().uppercase() + char.toString().toLowerCase().repeat(index) + if (index < s.length - 1) "-" else ""
        }.joinToString("")

//     val convertString = s.mapIndexed { index, char ->
//         char.toUpperCase() + char.toString().toLowerCase().repeat(index)
//     }.joinToString("-")

//     println(convertString)
        println(convert)

        return convert
    }
}