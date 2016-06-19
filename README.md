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

Linux users may be able to add a shortcut to the run command as follows:
1) Open ~/.bash_aliases
2) Type 'alias reddittohtml="java -cp.:~/git/reddittohtml/jsoup-1.9.2.jar:~/git/reddittohtml/ RedditRead
3) Save the file
4) Type 'source ~/.bash_aliases'
5) The command 'reddittohtml' in the command prompt should now work with the same functionality

*Remember to compile upon every pull request if there are changes
