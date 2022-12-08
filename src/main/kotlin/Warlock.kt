class Warlock(name: String = "WARLOCK") : Hero(name, HP = 400) {

    // Variablen für die Tochterklasse: WARLOCK

    var warlockAttack1 = 10.00
    var warlockAttack2 = 30.00
    var warlockAttack3 = 50.00
    var warlockAttackSuper = 70.00
    val warlockItem1 = 200.00
    var allWarlockAttacks = mutableListOf<Double>(warlockAttack1, warlockAttack2, warlockAttack3, warlockAttackSuper)


    override fun attack(opponent: FinalBossSavathun) {

        // Kampfmenü Warlock, Auswahl der Attacken + Items

        if (!isPlayerDefeated) {
            println("IT'S YOUR TURN WARLOCK, YOU CAN ATTACK SAVATHUN, USE POTION OR USE A POWER UP!")
            println("\n")
            println("To attack with ARCSTRIDER     -->     enter 1!")
            println("To attack with GUNSLINGER     -->     enter 2!")
            println("To attack with NIGHTSTALKER   -->     enter 3!")
            println("To attack with GOLDEN SYNTAX  -->     enter 4!")
            println("To use POTION                 -->     enter 5!")
            println("To use POWERUP                -->     enter 6!")


            var attack = readln().toInt()
            if (attack >= 1 && attack <= 4)
                opponent.looseHP(lostHP = allWarlockAttacks[attack - 1])

            // Auswahl Item 1: Potion HP + 200

            if (attack == 5) {
                var healing = playerHP + warlockItem1
                println("You used Potion. You received 200HP ")
                println("\n")
            }

            // Auswahl Item 2: PowerUP, Stärke der Angriffe um 10% steigern

            if (attack == 6) {
                warlockAttack1 *= 1.1
                warlockAttack2 *= 1.1
                warlockAttack3 *= 1.1
                println("SMART, YOU USED A POWER UP. YOUR ATTACKS INCREASES 10%!")
                println("\n")
            }
        }

    }


}

