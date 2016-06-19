This program cleans a Reddit thread and stores the cleaned html file in the $PATH_TO_FOLDER/html/ folder.
Use case: Convert html file to ebook formats like azw3 and epub using softwares like Calibre.
This software was needed because many existing applications could not extract information properly from reddit threads.

On UNIX:
1) Go to the folder
2) Compile with javac -cp .:jsoup-1.9.2.jar RedditRead.java WriteToHTMLFile.java
3) Run with java -cp .:$PATH_TO_FOLDER/jsoup-1.9.2.jar:$PATH_TO_FOLDER RedditRead

On Windows:
1) Go to the folder
2) Compile with javac -cp .;jsoup-1.9.2.jar RedditRead.java WriteToHTMLFile.java
3) Run with java -cp .;$PATH_TO_FOLDER/jsoup-1.9.2.jar;$PATH_TO_FOLDER RedditRead

16-06-2016
Madhav Kandukuri
