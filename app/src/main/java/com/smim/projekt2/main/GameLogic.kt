package com.smim.projekt2.main

import android.widget.Button
import com.smim.projekt2.R

class GameLogic {
    companion object{
        fun getCellIdFrom(button: Button) : Int{
            var cellId = 0
            val id = button.id
            when(button.id){
                R.id.button11 -> cellId = 1
                R.id.button12 -> cellId = 2
                R.id.button13 -> cellId = 3
                R.id.button14 -> cellId = 4
                R.id.button15 -> cellId = 5
                R.id.button16 -> cellId = 6
                R.id.button17 -> cellId = 7
                R.id.button18 -> cellId = 8
                R.id.button19 -> cellId = 9
                R.id.button20 -> cellId = 10

                R.id.button21 -> cellId = 11
                R.id.button22 -> cellId = 12
                R.id.button23 -> cellId = 13
                R.id.button24 -> cellId = 14
                R.id.button25 -> cellId = 15
                R.id.button26 -> cellId = 16
                R.id.button27 -> cellId = 17
                R.id.button28 -> cellId = 18
                R.id.button29 -> cellId = 19
                R.id.button30 -> cellId = 20

                R.id.button31 -> cellId = 21
                R.id.button32 -> cellId = 22
                R.id.button33 -> cellId = 23
                R.id.button34 -> cellId = 24
                R.id.button35 -> cellId = 25
                R.id.button36 -> cellId = 26
                R.id.button37 -> cellId = 27
                R.id.button38 -> cellId = 28
                R.id.button39 -> cellId = 29
                R.id.button40 -> cellId = 30

                R.id.button41 -> cellId = 31
                R.id.button42 -> cellId = 32
                R.id.button43 -> cellId = 33
                R.id.button44 -> cellId = 34
                R.id.button45 -> cellId = 35
                R.id.button46 -> cellId = 36
                R.id.button47 -> cellId = 37
                R.id.button48 -> cellId = 38
                R.id.button49 -> cellId = 39
                R.id.button50 -> cellId = 40

                R.id.button51 -> cellId = 41
                R.id.button52 -> cellId = 42
                R.id.button53 -> cellId = 43
                R.id.button54 -> cellId = 44
                R.id.button55 -> cellId = 45
                R.id.button56 -> cellId = 46
                R.id.button57 -> cellId = 47
                R.id.button58 -> cellId = 48
                R.id.button59 -> cellId = 49
                R.id.button60 -> cellId = 50

                R.id.button61 -> cellId = 51
                R.id.button62 -> cellId = 52
                R.id.button63 -> cellId = 53
                R.id.button64 -> cellId = 54
                R.id.button65 -> cellId = 55
                R.id.button66 -> cellId = 56
                R.id.button67 -> cellId = 57
                R.id.button68 -> cellId = 58
                R.id.button69 -> cellId = 59
                R.id.button70 -> cellId = 60

                R.id.button71 -> cellId = 61
                R.id.button72 -> cellId = 62
                R.id.button73 -> cellId = 63
                R.id.button74 -> cellId = 64
                R.id.button75 -> cellId = 65
                R.id.button76 -> cellId = 66
                R.id.button77 -> cellId = 67
                R.id.button78 -> cellId = 68
                R.id.button79 -> cellId = 69
                R.id.button80 -> cellId = 70

                R.id.button81 -> cellId = 71
                R.id.button82 -> cellId = 72
                R.id.button83 -> cellId = 73
                R.id.button84 -> cellId = 74
                R.id.button85 -> cellId = 75
                R.id.button86 -> cellId = 76
                R.id.button87 -> cellId = 77
                R.id.button88 -> cellId = 78
                R.id.button89 -> cellId = 79
                R.id.button90 -> cellId = 80

                R.id.button91 -> cellId = 81
                R.id.button92 -> cellId = 82
                R.id.button93 -> cellId = 83
                R.id.button94 -> cellId = 84
                R.id.button95 -> cellId = 85
                R.id.button96 -> cellId = 86
                R.id.button97 -> cellId = 87
                R.id.button98 -> cellId = 88
                R.id.button99 -> cellId = 89
                R.id.button100 -> cellId = 90

                R.id.button101 -> cellId = 91
                R.id.button102 -> cellId = 92
                R.id.button103 -> cellId = 93
                R.id.button104 -> cellId = 94
                R.id.button105 -> cellId = 95
                R.id.button106 -> cellId = 96
                R.id.button107 -> cellId = 97
                R.id.button108 -> cellId = 98
                R.id.button109 -> cellId = 99
                R.id.button110 -> cellId = 100
            }
            return cellId
        }

        fun getButtonIdFrom(cellId: Int): Int {
            var buttonId = 0
            when(cellId){
                  1 -> buttonId = R.id.button11
                  2 -> buttonId =  R.id.button12
                  3 -> buttonId =  R.id.button13
                  4 -> buttonId =  R.id.button14
                  5 -> buttonId =  R.id.button15
                  6 -> buttonId =  R.id.button16
                  7 -> buttonId =  R.id.button17
                  8 -> buttonId =  R.id.button18
                  9 -> buttonId =  R.id.button19
                  10 -> buttonId =  R.id.button20
                                     
                  11 -> buttonId =  R.id.button21
                  12 -> buttonId =  R.id.button22
                  13 -> buttonId =  R.id.button23
                  14 -> buttonId =  R.id.button24
                  15 -> buttonId =  R.id.button25
                  16 -> buttonId =  R.id.button26
                  17 -> buttonId =  R.id.button27
                  18 -> buttonId =  R.id.button28
                  19 -> buttonId =  R.id.button29
                  20 -> buttonId =  R.id.button30
                                      
                  21 -> buttonId =  R.id.button31
                  22 -> buttonId =  R.id.button32
                  23 -> buttonId =  R.id.button33
                  24 -> buttonId =  R.id.button34
                  25 -> buttonId =  R.id.button35
                  26 -> buttonId =  R.id.button36
                  27 -> buttonId =  R.id.button37
                  28 -> buttonId =  R.id.button38
                  29 -> buttonId =  R.id.button39
                  30 -> buttonId =  R.id.button40
                                      
                  31 -> buttonId =  R.id.button41
                  32 -> buttonId =  R.id.button42
                  33 -> buttonId =  R.id.button43
                  34 -> buttonId =  R.id.button44
                  35 -> buttonId =  R.id.button45
                  36 -> buttonId =  R.id.button46
                  37 -> buttonId =  R.id.button47
                  38 -> buttonId =  R.id.button48
                  39 -> buttonId =  R.id.button49
                  40 -> buttonId =  R.id.button50
                                      
                  41 -> buttonId =  R.id.button51
                  42 -> buttonId =  R.id.button52
                  43 -> buttonId =  R.id.button53
                  44 -> buttonId =  R.id.button54
                  45 -> buttonId =  R.id.button55
                  46 -> buttonId =  R.id.button56
                  47 -> buttonId =  R.id.button57
                  48 -> buttonId =  R.id.button58
                  49 -> buttonId =  R.id.button59
                  50 -> buttonId =  R.id.button60
                                      
                  51 -> buttonId =  R.id.button61
                  52 -> buttonId =  R.id.button62
                  53 -> buttonId =  R.id.button63
                  54 -> buttonId =  R.id.button64
                  55 -> buttonId =  R.id.button65
                  56 -> buttonId =  R.id.button66
                  57 -> buttonId =  R.id.button67
                  58 -> buttonId =  R.id.button68
                  59 -> buttonId =  R.id.button69
                  60 -> buttonId =  R.id.button70
                                      
                  61 -> buttonId =  R.id.button71
                  62 -> buttonId =  R.id.button72
                  63 -> buttonId =  R.id.button73
                  64 -> buttonId =  R.id.button74
                  65 -> buttonId =  R.id.button75
                  66 -> buttonId =  R.id.button76
                  67 -> buttonId =  R.id.button77
                  68 -> buttonId =  R.id.button78
                  69 -> buttonId =  R.id.button79
                  70 -> buttonId =  R.id.button80
                                      
                  71 -> buttonId =  R.id.button81
                  72 -> buttonId =  R.id.button82
                  73 -> buttonId =  R.id.button83
                  74 -> buttonId =  R.id.button84
                  75 -> buttonId =  R.id.button85
                  76 -> buttonId =  R.id.button86
                  77 -> buttonId =  R.id.button87
                  78 -> buttonId =  R.id.button88
                  79 -> buttonId =  R.id.button89
                  80 -> buttonId =  R.id.button90
                                     
                 81 -> buttonId =  R.id.button91
                 82 -> buttonId =  R.id.button92
                 83 -> buttonId =  R.id.button93
                 84 -> buttonId =  R.id.button94
                 85 -> buttonId =  R.id.button95
                 86 -> buttonId =  R.id.button96
                 87 -> buttonId =  R.id.button97
                 88 -> buttonId =  R.id.button98
                 89 -> buttonId =  R.id.button99
                 90 -> buttonId = R.id.button100

                 91     -> buttonId =    R.id.button101
                 92     -> buttonId =    R.id.button102
                 93     -> buttonId =    R.id.button103
                 94     -> buttonId =    R.id.button104
                 95     -> buttonId =    R.id.button105
                 96     -> buttonId =    R.id.button106
                 97     -> buttonId =    R.id.button107
                 98     -> buttonId =    R.id.button108
                 99     -> buttonId =    R.id.button109
                 100    -> buttonId =    R.id.button110
            }
            return buttonId
        }

        fun checkForWinner(player1: List<Int>, player2: List<Int>) : Int?{
            //Check for 5 in a row
            for(i in 1..100 step 10){
                var player1Counter = 0
                var player2Counter = 0
                for(j in i until i+10){
                    if(player1.contains(j))
                        player1Counter++
                    else
                        player1Counter = 0
                    if(player2.contains(j))
                        player2Counter++
                    else
                        player2Counter = 0
                    if(player1Counter == 5)
                        return 1
                    else if(player2Counter == 5)
                        return 2
                }
            }
            //Check for 5 in a col
            for(i in 1..10){
                var player1Counter = 0
                var player2Counter = 0
                for(j in 0..9){
                    var index = i+j*10
                    if(player1.contains(i+j*10))
                        player1Counter++
                    else
                        player1Counter=0
                    if(player2.contains(i+j*10))
                        player2Counter++
                    else
                        player2Counter=0
                    if(player1Counter == 5)
                        return 1
                    else if(player2Counter == 5)
                        return 2
                }
            }
            //Check first diagonals
           for(col in 1..6){
               var player1Counter = 0
               var player2Counter = 0
               for(i in 0..100 step 11){
                   if(player1.contains(col+i))
                       player1Counter++
                   else
                       player1Counter=0
                   if(player2.contains(col+i))
                       player2Counter++
                   else
                       player2Counter=0
                   if(player1Counter == 5)
                       return 1
                   else if(player2Counter == 5)
                       return 2
               }
           }
            for(row in 11..51 step 10){
                var player1Counter = 0
                var player2Counter = 0
                for(i in 0..100 step 11){
                    if(player1.contains(row+i))
                        player1Counter++
                    else
                        player1Counter=0
                    if(player2.contains(row+i))
                        player2Counter++
                    else
                        player2Counter=0
                    if(player1Counter == 5)
                        return 1
                    else if(player2Counter == 5)
                        return 2
                }
            }
            //Check second diagonals
            for(col in 5..10){
                var player1Counter = 0
                var player2Counter = 0
                for(i in 0..100 step 9){
                    if(player1.contains(col+i))
                        player1Counter++
                    else
                        player1Counter=0
                    if(player2.contains(col+i))
                        player2Counter++
                    else
                        player2Counter=0
                    if(player1Counter == 5)
                        return 1
                    else if(player2Counter == 5)
                        return 2
                }
            }
            for(row in 10..60 step 10){
                var player1Counter = 0
                var player2Counter = 0
                for(i in 0..100 step 9){
                    if(player1.contains(row+i))
                        player1Counter++
                    else
                        player1Counter=0
                    if(player2.contains(row+i))
                        player2Counter++
                    else
                        player2Counter=0
                    if(player1Counter == 5)
                        return 1
                    else if(player2Counter == 5)
                        return 2
                }
            }
            return null
        }
    }

}