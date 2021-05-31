package com.dicoding.jlegends.legends

import com.dicoding.jlegends.R

object LegendsData {

    private val data = arrayOf(
            arrayOf(
                    "Alessandro Del Piero",
                    "Forward",
                    R.drawable.legends_01_del_piero,
                    "Alessandro Del Piero penyerang tajam dengan teknik bermain tinggi dan bisa jadi pengatur serangan. Keleihan lainnya adalah tendangan bebas. Penilik 346 gol dengan Juventus sudah memenangi enam Scudetto, empat Coppa Italia, dan satu Liga Champions.",
                    ": 513\n"+
                            ": 1993-2012\n"+
                            ": 174 cm\n"+
                            ": Penyerang"
            ),
            arrayOf(
                    "Gianluigi Buffon",
                    "Goalkeeper",
                    R.drawable.legends_02_buffon,
                    "Gianluigi Buffon menjadi salah satu pemain yang didatangkan Juventus di musim 2001-2002 bersama rekan setimnya di Parma yaitu Lilian Thuram dan gelandang SS Lazio Pavel Nedved. Juventus sendiri berhasil mendapatkan uang segar usai menjual bintang mereka Zinedine Zidane ke Real Madrid. Juventus juga kemudian mendatangkan Marcello Lippi kembali sebagai pelatih usai memecat Carlo Ancelotti yang dinilai gagal mengantar Juve juara Serie A sekalipun dibekali dengan pemain-pemain bintang.",
                    ": 524\n"+
                            ": 2001-2021\n"+
                            ": 192 cm\n"+
                            ": Penjaga Gawang"
            ),
            arrayOf(
                    "Pavel Nedved",
                    "Attacking Midfielder",
                    R.drawable.legends_03_nedved,
                    "Wakil Presiden Juventus bermain dengan klub pada medio 2001-2009. Dalam kurun waktu tersebut Pavel Nedved identik dengan rambut gondrong berwarna pirang dan tendangan kencangnya. Dia bisa bermain di posisi sayap hingga gelandang serang.",
                    ": 247\n"+
                            ": 2001-2009\n"+
                            ": 177 cm\n"+
                            ": Gelandang Serang"
            ),
            arrayOf(
                    "Zinedine Zidane",
                    "Attacking Midfielder",
                    R.drawable.legends_04_zidane,
                    "Zizou bukan hanya menyandang status legenda Real Madrid dan ikon sepak bola Prancis, melainkan juga legenda Juventus yang bermain pada medio 1996-2001. Sang maestro tampil lebih dari 200 laga bersama Juve dan memenangi penghargaan Pemain Terbaik dua kali.",
                    ": 151\n"+
                            ": 1996-2001\n"+
                            ": 185 cm\n"+
                            ": Gelandang Serang"
            ),
            arrayOf(
                    "David Trezeguet",
                    "Forward",
                    R.drawable.legends_05_trezeguet,
                    "Ketika Serie A mengalahkan popularitas Premier League pada medio awal 2000-an, banyak bintang-bintang berkualitas yang bermain di sana. Salah satunya adalah David Trezeguet yang memperkuat Juventus pada medio 2000-2010.",
                    ": 218\n"+
                            ": 2000-2010\n"+
                            ": 187 cm\n"+
                            ": Penyerang"
            ),
            arrayOf(
                    "Roberto Baggio",
                    "Attacking Midfielder",
                    R.drawable.legends_06_baggio,
                    "Roberto Baggio merupakan mantan pemain sepak bola berkebangsaan italia. Dia meraih penghargaan sebagai Pemain Terbaik FIFA pada tahun 1993. Dia merupakan pemain terbaik Italia saat membela timnya di Piala Dunia FIFA 1994. Hasil terbaiknya ialah runner-up timnas Italia pada Piala Dunia 1994.",
                    ": 141\n"+
                            ": 1990-1995\n"+
                            ": 174 cm\n"+
                            ": Gelandang Serang"
            ),
            arrayOf(
                    "Dino Zoff",
                    "Goalkeeper",
                    R.drawable.legends_07_dino_zoff,
                    "Dua kiper terbaik Italia pernah bermain untuk Juventus. Dino Zoff terlebih dahulu mengukir sejarah sebelum Gianluigi Buffon pada medio 1970-an. Selama memperkuat Juventus, Zoff bermain di 476 pertandingan dan memenangi enam Scudetto, dua Coppa Italia, dan UEFA Cup. Titel Piala Dunia 1982 dan Euro 1968 mempermanis catatan kariernya.",
                    ": 330\n"+
                            ": 1972-1983\n"+
                            ": 182 cm\n"+
                            ": Penjaga Gawang"
            ),
            arrayOf(
                    "Michel Platini",
                    "Attacking Midfielder",
                    R.drawable.legends_08_platini,
                    "Memenangi tiga Ballon d'Or kala memperkuat Juventus (1982-1987) seharusnya sudah cukup menggambarkan kualitasnya bersama klub. Beberapa titel besar juga pernah dimenanginya pada medio 1980-an. Kendati namanya tercoreng karena skandal korupsinya di UEFA, popularitas Platini sebagai pemain tidak pernah ternodai.",
                    ": 147\n"+
                            ": 1982-1987\n"+
                            ": 178 cm\n"+
                            ": Gelandang Serang"
            ),
            arrayOf(
                    "Edgar Davids",
                    "Midfielder",
                    R.drawable.legends_09_edgar,
                    "Edgar Steven Davids adalah seorang pemain sepak bola asal Belanda yang telah pensiun dan kini menjabat anggota dewan supervisor klub Ajax Amsterdam di Liga Utama Belanda. Klub-klub yang pernah ia bela adalah Ajax Amsterdam, Tottenham Hotspur, AC Milan, Juventus, FC Barcelona, dan Inter Milan.",
                    ": 159\n"+
                            ": 1997-2004\n"+
                            ": 170 cm\n"+
                            ": Gelandang"
            ),
            arrayOf(
                    "Antonio Conte",
                    "Midfielder",
                    R.drawable.legends_10_conte,
                    "Antonio Conte merupakan mantan pemain sepak bola berkebangsaan Italia. Ia pernah bermain untuk tim U.S. Lecce dan Juventus. Ia juga pernah bermain untuk Tim nasional sepak bola Italia dengan 20 kali main dan 2 gol. Hasil terbaiknya ialah ketika Italia meraih runner-up di Piala Dunia FIFA 1994.",
                    ": 295\n"+
                            ": 1992-2004\n"+
                            ": 178 cm\n"+
                            ": Gelandang"
            )
    )

    val listData: ArrayList<Legends>
        get() {
            val list = ArrayList<Legends>()
            for (data in data) {
                val legends = Legends()
                legends.name = data[0] as String
                legends.area = data[1] as String
                legends.photo = data[2] as Int
                legends.overview = data[3] as String
                legends.detail = data[4] as String
                list.add(legends)
            }
            return list
        }
}