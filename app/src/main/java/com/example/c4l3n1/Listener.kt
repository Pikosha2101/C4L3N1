package com.example.c4l3n1

interface Listener<T: IParam> {
    fun onClick(param: T)
}
interface IParam