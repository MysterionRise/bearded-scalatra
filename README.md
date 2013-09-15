# H2H Fantasy on sports.ru #

## Build & Run ##

```sh
$ ./sbt
> container:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

## Deploy to Heroku server ##

```sh
$ git add remote heroku $HEROKU_URL
$ git push heroku master
```
