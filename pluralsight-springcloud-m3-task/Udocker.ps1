﻿
## ----------------------
## Get image from hub
## ----------------------

# Set-ExecutionPolicy Unrestricted -Scope CurrentUser
# docker login -u smsnotes -p REG123456DEL  https://hub.docker.com
# docker pull mysql/mysql-server
# docker pull --h



## ----------------------
## handle docker 
## ----------------------

# docker  rmi  mysql
# docker run --name=pluralsight -d mysql/mysql-server

# docker stop rabbitmqpluralsight
# docker stop mysqlpluralsight
# docker  images
# docker container rm dd956e34874f
# docker container --help
# docker container ls -a

# docker run --name=pluralsight -d 




## ----------------------
## mysql container 
## ----------------------
# Set-Location -LiteralPath "C:\Program Files\Docker Toolbox"
# cd /c/Program Files/Docker Toolbox linux
# cd c:/Program Files/Docker Toolbox win
# docker-machine.exe ls
# docker-compose.exe -f mysql.yml  --verbose  up 
# docker-compose2 -f mysql.yml  --log-level INFO  up
# docker run --name=pluralsight -d 
# docker container ls -a
# docker stop pluralsight
# docker container rm 79ea0a5c0d48
# docker exec -it pluralsight  myql -uroot -p   ### remote  pass : ilovebnhp



## ------------------
## REMOTE to MYSQL
## ------------------

# start eclipes external too to run MYSQL from the YML
# login to the container
#     1 -> docker exec -it pluralsight bash -l
#     2 -> mysql -u root -pilovebnhp -h 192.168.99.100:3306 tasklogs 
#      mysql -u root -pilovebnhp
# first time container run? let access   
# 3 GRANT ALL PRIVILEGES ON * . * TO 'psuser'@'%';

# 4. mysql commands 
# show databases;
# exit
#  use [db name];  show tables;   SELECT * FROM [table name];

# ---  
# Let root to access from any IP
# use mysql;
# flush privileges;
# update user set host="%" where user="root" and host="localhost";
# GRANT ALL PRIVILEGES ON * . * TO 'psuser'@'%';

# -- admin commands
# mysqladmin status
# mysqladmin -uroot -pilovebnhp refresh
# mysqladmin -uroot -pilovebnhp reload

