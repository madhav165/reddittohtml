This program cleans a Reddit thread and stores the cleaned html file in the $PATH_TO_FOLDER/html/ folder.
Use case: Convert html file to ebook formats like azw3 and epub using softwares like Calibre.
This software was needed because many existing applications could not extract information properly from reddit threads.

On UNIX:
1) Create folder 'git' in your home directory
2) Run the command 'git clone https://github.com/madhav165/reddittohtml.git'
3) Change to the newly created directory
4) Run with java -cp .:$PATH_TO_FOLDER/jsoup-1.9.2.jar:$PATH_TO_FOLDER RedditRead

On Windows:
Run with java -cp .;$PATH_TO_FOLDER/jsoup-1.9.2.jar;$PATH_TO_FOLDER RedditRead

Linux users may be able to add a shortcut to the run command as follows:
1) Open ~/.bash_aliases
2) Type 'alias reddittohtml="java -cp.:$PATH_TO_FOLDER/jsoup-1.9.2.jar:$PATH_TO_FOLDER RedditRead
3) Save the file
4) Type 'source ~/.bash_aliases'
5) The command 'reddittohtml' in the command prompt should now work with the same functionality
