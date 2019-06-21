package com.example.sports

class Sport {
    var _sportName:String? = null
    var _sportDetail:String?=  null
    var _sportImage:Int? = null

    constructor(sportName:String,sportDetail:String,sportImage:Int)
    {
        this._sportName = sportName
        this._sportDetail = sportDetail
        this._sportImage = sportImage

    }
}