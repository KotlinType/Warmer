package com.compose.jetnav.navigate.base.viewmodel

interface Event<T> {
	fun send(event: T)
}

val eventException: (state: String, event: String) -> Unit = { state, event ->
	throw Exception("EventException: state $state cannot receive $event events")
}
