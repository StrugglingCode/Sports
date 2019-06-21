package com.example.sports

class SportDatabase {

    var sportList:ArrayList<Sport>? = null

    constructor()
    {
        sportList = ArrayList()

        sportList?.add(Sport("Boxing",
            "Boxing is a combat sport in which two people, usually wearing protective gloves, " +
                    "throw punches at each other for a predetermined amount of time in a boxing ring."
            ,R.drawable.boxing))

        sportList?.add(Sport("Wrestling","Professional wrestling " +
                "(often shortened to pro wrestling or simply wrestling) " +
                "is a form of performance art and entertainment that combines athletics with theatrical performance.",
            R.drawable.wrestling))

       sportList?.add(Sport("Taekwondo","Taekwondo is a combative sport " +
                "and was developed during the 1940s and 1950s by Korean martial artists " +
                "with experience in martial arts such as karate, Chinese martial arts," +
                " and indigenous Korean martial arts traditions such as Taekkyon, Subak, and Gwonbeop.",R.drawable.taekwondo))

        sportList?.add(Sport("CrossFit","CrossFit is a lifestyle characterized by safe, " +
                "effective exercise and sound nutrition. " +
                "CrossFit can be used to accomplish any goal, from improved health to weight loss to better performance."
            ,R.drawable.crossfit))

        sportList?.add(Sport("Karate","Karate is a martial art developed in the Ryukyu Kingdom."
        ,R.drawable.karate))

        sportList?.add(Sport("Football","Football is a family of team sports that involve, " +
                "to varying degrees, kicking a ball to score a goal.",
            R.drawable.football))

        sportList?.add(Sport("BodyBuilding","Bodybuilding is the use of progressive resistance " +
                "exercise to control" +
                " and develop one's musculature for aesthetic purposes.",R.drawable.bodybuilding))

        sportList?.add(Sport("Judo","Judo  was originally created in 1882 by Jigoro Kano" +
                "as a physical, mental, and moral pedagogy in Japan. " +
                "It is generally categorized as a modern martial art, " +
                "which later evolved into a combat and Olympic sport.",R.drawable.judo))


    }

}