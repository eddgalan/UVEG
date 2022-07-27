# Crea el respaldo de la base de datos
mysqldump -h localhost -u root -p hospital doctores > C:\Users\username\Documents\Respaldos\respaldo_doctorestabla.sql

# Abre el CLI de MySQL
mysql -u root -p hospital

# Recupera el respaldo
source C:\Users\username\Documents\Respaldos\respaldo_doctorestabla.sql

