CREATE TABLE produto(
    id serial NOT NULL,
    nome char(100) NOT NULL,
    valor numeric(1000,2) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE itemlista(
    id serial PRIMARY KEY NOT NULL,
    quantidade integer NOT NULL,
    preco numeric(1000,2) NOT NULL,
    supermercado char(50) NOT NULL,
    comprado BOOLEAN NOT NULL DEFAULT(false),
    datacompra timestamp WITHOUT time zone,
    clienteid integer,
    produtoid integer,
    FOREIGN KEY (clienteid) REFERENCES cliente(id),
    FOREIGN KEY (produtoid) REFERENCES produto(id)
);

drop table itemlista;

CREATE TABLE account_role
(
  user_id integer NOT NULL,
  role_id integer NOT NULL,
  grant_date timestamp without time zone,
  PRIMARY KEY (user_id, role_id),
  CONSTRAINT account_role_role_id_fkey FOREIGN KEY (role_id)
      REFERENCES role (role_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT account_role_user_id_fkey FOREIGN KEY (user_id)
      REFERENCES account (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);