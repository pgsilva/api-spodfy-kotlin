CREATE TABLE IF NOT EXISTS mensagem (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  texto VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS SESSIONUSERSPOTIFY (
  id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nr_ip_user VARCHAR  NULL,
  access_token VARCHAR  NULL,
  token_type VARCHAR  NULL,
  expires_in VARCHAR  NULL,
  refresh_token VARCHAR  NULL,
  scope VARCHAR  NULL
);


