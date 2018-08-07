package com.amaze.filepreloaderlibrary

object Native {
	init {
		System.loadLibrary("native-filesystem-functions")
	}

	external fun getDirectoriesInDirectory(directory: String): Array<String>

	external fun getFilesInDirectory(directory: String): Array<String>
}