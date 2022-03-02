
# Postgres Client dbeaver
  * `sudo snap install dbeaver-ce`
  * `dbeaver-ce`

# Start/Stop Event Database
  * `sudo docker run --name eventdb -e POSTGRES_PASSWORD=eventpw -d -p 5432:5432 postgres`
  * `sudo docker container ls -a`
  * `sudo docker container rm <id>`
  * `sudo docker stop eventdb`

# deployments
  * local home: http://localhost:8092
  * anzeige eines typs eines batches: http://localhost:8092/status/1645534897194/infoo
  * HAL explorer: http://localhost:8092/explorer/index.html#uri=/

# reset db

  * `DROP TABLE public.flyway_schema_history;`
  * `DROP TABLE public.status;`
