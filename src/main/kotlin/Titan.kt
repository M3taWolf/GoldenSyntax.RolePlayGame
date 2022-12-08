class Titan(name: String = "TITAN") : Hero(name, HP = 400) {

    // Variablen für die Tochterklasse: TITAN

    var titanAttack1 = 15.00
    var titanAttack2 = 30.00
    var titanAttack3 = 45.00
    var titanAttackSuper = 60.00
    val titanItem1 = 200.00
    var allTitanAttacks = mutableListOf<Double>(titanAttack1, titanAttack2, titanAttack3, titanAttackSuper)



    override fun attack(opponent: FinalBossSavathun) {

        // Kampfmenü TITAN, Auswahl der Attacken + Items

        if (!isPlayerDefeated) {
            println("IT'S YOUR TURN TITAN, YOU CAN ATTACK SAVATHUN, USE POTION OR USE A POWER UP!")
            println("\n")
            println("To attack with STRIKER         -->     enter 1!")
            println("To attack with SENTINEL        -->     enter 2!")
            println("To attack with SUNBREAKER      -->     enter 3!")
            println("To attack with GOLDEN SYNTAX   -->     enter 4!")
            println("To use POTION                  -->     enter 5!")
            println("To use POWERUP                 -->     enter 6!")


            var attack = readln().toInt()
            if (attack >= 1 && attack <= 4)
                opponent.looseHP(lostHP = allTitanAttacks[attack - 1])


            // Auswahl Item 1: Potion HP + 200

            if (attack == 5) {
                var healing = playerHP + titanItem1
                println("WELL DONE WARRIOR! YOU USED POTION. YOU RECEIVED 200HP!")
                println("\n")
            }


            // Auswahl Item 2: PowerUP, Stärke der Angriffe um 10% steigern

            if (attack == 6) {
                titanAttack1 *= 1.1
                titanAttack2 *= 1.1
                titanAttack3 *= 1.1
                println("SMART, YOU USED A POWER UP. YOUR ATTACKS INCREASES 10%!")
                println("\n")
            }

            // CHEATCODE XXX

            if (attack == 666) {
                titanAttack1 *= 666.66
                titanAttack2 *= 666.66
                titanAttack3 *= 666.66
                opponent.looseHP(
                    opponent.bossHP
                )

                println("CHEATER!! U DEFEATED SAVATHUN WITHOUT FIGHTING!! FORGET ABOUT HEAVEN!!")
                println("SEE U IN HELL!!")
                println("\n")

            }

        }


    }
}