package com.example.demo.service

import com.example.demo.reqres.Request
import com.example.demo.reqres.Response

interface PostServiceInterface {

    fun create (request: Request) : Response
}