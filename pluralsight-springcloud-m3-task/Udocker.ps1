
## ----------------------
## Get image from hub
## ----------------------

# Set-ExecutionPolicy Unrestricted -Scope CurrentUser
# docker login -u smsnotes -p RG16  https://docker.com
# docker pull mysql/mysql-server
  docker pull mysql/mysql-server
# docker pull --h



## ----------------------
## handle docker 
## ----------------------

# docker  rmi  mysql
# docker run --name=pluralsight -d mysql/mysql-server

# docker stop mysqlpluralsight
# docker stop ebdd15bce1a9
# docker  images
# docker container rm rabbitmqpluralsight
# docker container --help
# cls;docker container ls -a
# cls
# docker run --name=pluralsight -d 




## ----------------------
## mysql container 
## ----------------------
# Set-Location -LiteralPath "C:\Program Files\Docker Toolbox"
# cd c:/Program Files/Docker Toolbox
# docker-machine.exe ls
# docker-compose.exe -f mysql.yml  --verbose  up 
# docker-compose2 -f mysql.yml  --log-level INFO  up
# docker run --name=pluralsight -d 
# docker container ls -a
# docker stop rabbitmqpluralsight
# docker stop mysqlpluralsight
# docker container rm 9cd788cd48dc
# docker exec -it mysqlpluralsight  myql -uroot -p   ### remote  pass : ilovebnhp



## ------------------
## REMOTE to MYSQL
## ------------------

# start eclipes external too to run MYSQL from the YML
# login to the container
#     1 -> docker exec -it mysqlpluralsight bash -l
#     2 -> mysql -u root -pilovebnhp -h 192.168.99.100:3306 tasklogs 
#          mysql -u root -pilovebnhp
#     first time container run? let access 
#     3. GRANT ALL PRIVILEGES ON * . * TO 'psuser'@'%';

# 4. mysql commands 
# use mysql;update user set host="%" where user="root" and host="localhost";flush privileges;
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
# mysqladmin -uroot -pilovebnhp refresh;
# mysqladmin -uroot -pilovebnhp reload;

