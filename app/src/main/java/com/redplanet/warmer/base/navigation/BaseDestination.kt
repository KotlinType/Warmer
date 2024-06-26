package com.redplanet.warmer.base.navigation

/**
 * BaseDestination - the base class for the destination
 * @property destination basic navigation destination
 * @property destinationArg the destination for navigation with set argument
 * @property destinationArgs the destination for navigation with set arguments
 */
abstract class BaseDestination {
	abstract val destination: String
	protected open val destinationArg = { arg: String -> newDestination(arg) }
	protected open val destinationArgs = { args: List<String> -> newDestination(args) }

	/**
	 * @param arg navigation argument
	 * @return the path with the passed argument
	 */
	private fun newDestination(arg: String): String {
		return "${basePath()}/$arg"
	}

	/**
	 * @param args navigation arguments
	 * @return the path with the passed arguments
	 */
	private fun newDestination(args: List<String>): String {
		return args.fold(this.basePath()) { acc, arg -> "$acc/$arg" }
	}

	private fun basePath() = destination.split('/').first()
}
