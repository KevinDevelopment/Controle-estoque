CREATE DATABASE INFORMATICA;

USE INFORMATICA;

CREATE TABLE PLACA_MAE(

	NUM_SERIE NUMERIC(6) ,
	COD_FORNECEDOR NUMERIC(3),
	NM_NOME VARCHAR(250) ,
    PC_PRECO NUMERIC(10,2) ,
    DA_TEC VARCHAR(4000) 

);  





INSERT INTO PLACA_MAE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121235,203,'ROGSTRIX',646.20,'4GB');
INSERT INTO PLACA_MAE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121238,203,'ROGSTRIX',646.20,'4GB');
INSERT INTO PLACA_MAE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121231,203,'ROGSTRIX',646.20,'4GB');
INSERT INTO PLACA_MAE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121237,204,'ROGSTRIX',686.27,'1GB');
INSERT INTO PLACA_MAE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121239,203,'GIGABYTE',689.20,'3GB');
INSERT INTO PLACA_MAE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121233,203,'GIGABYTE',626.20,'6GB');
INSERT INTO PLACA_MAE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121232,203,'AZUSPRIME',646.20,'2GB');

SELECT * FROM PLACA_MAE;

Select nome_fornecedor,num_serie,pc_preco
From placa_mae m
Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;

ALTER TABLE PLACA_MAE
ADD CONSTRAINT NUM_SERIE_PK_PLACA_MAE PRIMARY KEY (NUM_SERIE);

ALTER TABLE PLACA_MAE 
ADD CONSTRAINT COD_FORNECEDOR_FK_PLACA_MAE FOREIGN KEY (COD_FORNECEDOR)
REFERENCES FORNECEDOR (COD_FORNECEDOR);

ALTER TABLE PLACA_MAE
MODIFY COLUMN COD_FORNECEDOR NUMERIC(3) NOT NULL;

ALTER TABLE PLACA_MAE
MODIFY COLUMN NM_NOME VARCHAR(250) NOT NULL;

ALTER TABLE PLACA_MAE 
MODIFY COLUMN PC_PRECO NUMERIC(10,2) NOT NULL;

ALTER TABLE PLACA_MAE 
MODIFY COLUMN DA_TEC VARCHAR(4000) NOT NULL;
        


CREATE TABLE PLACA_VIDEO(

	NUM_SERIE NUMERIC(6) ,
	COD_FORNECEDOR NUMERIC(3), 
	NM_NOME VARCHAR(250) ,
    PC_PRECO NUMERIC(10,2) ,
   	DA_TEC VARCHAR(4000) 

);

INSERT INTO PLACA_VIDEO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (203040,203,'GTX1050TI',646.20,'4GB');
INSERT INTO PLACA_VIDEO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (203041,201,'GTX750',246.20,'2GB');
INSERT INTO PLACA_VIDEO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (203042,200,'GTX1080TI',746.20,'6GB');
INSERT INTO PLACA_VIDEO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (203043,202,'RTX2600',686.27,'12GB');
INSERT INTO PLACA_VIDEO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (203044,203,'GTX1660TI',689.20,'6GB');
INSERT INTO PLACA_VIDEO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (203045,203,'RTX2080TI',2626.20,'11GB');
INSERT INTO PLACA_VIDEO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (203046,204,'GTX1050TI',7446.20,'3GB');

SELECT * FROM PLACA_VIDEO;

Select nome_fornecedor,num_serie,pc_preco
From placa_video m
Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;

ALTER TABLE PLACA_VIDEO
ADD CONSTRAINT NUM_SERIE_PK_PLACA_VIDEO PRIMARY KEY (NUM_SERIE);

ALTER TABLE PLACA_VIDEO
ADD CONSTRAINT COD_FORNECEDOR_FK_PLACA_VIDEO FOREIGN KEY (COD_FORNECEDOR)
REFERENCES FORNECEDOR (COD_FORNECEDOR);

ALTER TABLE PLACA_VIDEO
MODIFY COLUMN COD_FORNECEDOR NUMERIC(3) NOT NULL;

ALTER TABLE PLACA_VIDEO
MODIFY COLUMN NM_NOME VARCHAR(250) NOT NULL;

ALTER TABLE PLACA_VIDEO 
MODIFY COLUMN PC_PRECO NUMERIC(10,2) NOT NULL;

ALTER TABLE PLACA_VIDEO 
MODIFY COLUMN DA_TEC VARCHAR(4000) NOT NULL;




CREATE TABLE PROCESSADOR(

	NUM_SERIE NUMERIC(6),
	COD_FORNECEDOR NUMERIC(3), 
	NM_NOME VARCHAR(250) ,
    PC_PRECO NUMERIC(10,2) ,
   	DA_TEC VARCHAR(4000) 

);


INSERT INTO PROCESSADOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (204051,203,'RYZEN3950X',6646.20,'3.5GHZ');
INSERT INTO PROCESSADOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (204052,200,'RYZEN3950X',6646.20,'3.5GB');
INSERT INTO PROCESSADOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (204053,203,'RYZEN2600',646.20,'3.2GHZ');
INSERT INTO PROCESSADOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (204054,204,'INTELCOREI9',1686.27,'3.6GHZ');
INSERT INTO PROCESSADOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (204055,203,'INTELCOREI3',689.20,'3.0GHZ');
INSERT INTO PROCESSADOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (204056,203,'INTELCOREI7',826.20,'3.7GHZ');
INSERT INTO PROCESSADOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (204057,203,'INTELCOREI5',646.20,'2.9GHZ');

SELECT * FROM PROCESSADOR;

Select nome_fornecedor,num_serie,pc_preco
From processador m
Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;



ALTER TABLE PROCESSADOR
ADD CONSTRAINT NUM_SERIE_PK_PROCESSADOR PRIMARY KEY (NUM_SERIE);

ALTER TABLE PROCESSADOR
ADD CONSTRAINT COD_FORNECEDOR_FK_PROCESSADOR FOREIGN KEY (COD_FORNECEDOR)
REFERENCES FORNECEDOR (COD_FORNECEDOR);

ALTER TABLE PROCESSADOR
MODIFY COLUMN COD_FORNECEDOR NUMERIC(3) NOT NULL;

ALTER TABLE PROCESSADOR
MODIFY COLUMN NM_NOME VARCHAR(250) NOT NULL;

ALTER TABLE PROCESSADOR 
MODIFY COLUMN PC_PRECO NUMERIC(10,2) NOT NULL;

ALTER TABLE PROCESSADOR 
MODIFY COLUMN DA_TEC VARCHAR(4000) NOT NULL;





CREATE TABLE MEMORIA_RAM(

	NUM_SERIE NUMERIC(6),
	COD_FORNECEDOR NUMERIC(3) ,
	NM_NOME VARCHAR(250) ,
    PC_PRECO NUMERIC(10,2) ,
    DA_TEC VARCHAR(4000)


);

INSERT INTO MEMORIA_RAM (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200001,204,'HIPERX',646.20,'8G8');
INSERT INTO MEMORIA_RAM (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200002,203,'HIPERX',646.20,'4GB');
INSERT INTO MEMORIA_RAM (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200003,200,'HIPERX',646.20,'4GB');
INSERT INTO MEMORIA_RAM (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200004,200,'G.SKILL',686.27,'8GB');
INSERT INTO MEMORIA_RAM (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200005,204,'NASASUTOR',689.20,'16GB');
INSERT INTO MEMORIA_RAM (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200006,201,'NASASUTOR',626.20,'8GB');
INSERT INTO MEMORIA_RAM (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200007,201,'XPG',646.20,'4GB');

SELECT * FROM MEMORIA_RAM;

Select nome_fornecedor,num_serie,pc_preco
From memoria_ram m
Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;


ALTER TABLE MEMORIA_RAM
ADD CONSTRAINT NUM_SERIE_PK_MEMORIA_RAM PRIMARY KEY (NUM_SERIE);

ALTER TABLE MEMORIA_RAM
ADD CONSTRAINT COD_FORNECEDOR_FK_MEMORIA_RAM FOREIGN KEY (COD_FORNECEDOR)
REFERENCES FORNECEDOR (COD_FORNECEDOR);

ALTER TABLE MEMORIA_RAM
MODIFY COLUMN COD_FORNECEDOR NUMERIC(3) NOT NULL;

ALTER TABLE MEMORIA_RAM
MODIFY COLUMN NM_NOME VARCHAR(250) NOT NULL;

ALTER TABLE MEMORIA_RAM 
MODIFY COLUMN PC_PRECO NUMERIC(10,2) NOT NULL;

ALTER TABLE MEMORIA_RAM 
MODIFY COLUMN DA_TEC VARCHAR(4000) NOT NULL;




CREATE TABLE FONTE(

	NUM_SERIE NUMERIC(6) ,
	COD_FORNECEDOR NUMERIC(3) ,
	NM_NOME VARCHAR(250) ,
    PC_PRECO NUMERIC(10,2), 
    DA_TEC VARCHAR(4000) 


);

INSERT INTO FONTE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200020,203,'ONEPOWER',246.20,'600W');
INSERT INTO FONTE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200021,203,'ONEPOWER',246.20,'750W');
INSERT INTO FONTE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200022,203,'CROSSERPLUS',646.20,'760W');
INSERT INTO FONTE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200023,204,'CROSSERPLUS',886.27,'800W');
INSERT INTO FONTE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200024,203,'EVGA',1689.20,'650W');
INSERT INTO FONTE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200025,203,'ATX',626.20,'400W');
INSERT INTO FONTE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200026,203,'ATX',646.20,'450W');


SELECT * FROM FONTE;

Select nome_fornecedor,num_serie,pc_preco
From fonte m
Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;




ALTER TABLE FONTE
ADD CONSTRAINT NUM_SERIE_PK_FONTE PRIMARY KEY (NUM_SERIE);

ALTER TABLE FONTE 
ADD CONSTRAINT COD_FORNECEDOR_FK_FONTE FOREIGN KEY (COD_FORNECEDOR)
REFERENCES FORNECEDOR (COD_FORNECEDOR);

ALTER TABLE FONTE
MODIFY COLUMN COD_FORNECEDOR NUMERIC(3) NOT NULL;

ALTER TABLE FONTE
MODIFY COLUMN NM_NOME VARCHAR(250) NOT NULL;

ALTER TABLE FONTE
MODIFY COLUMN PC_PRECO NUMERIC(10,2) NOT NULL;

ALTER TABLE FONTE
MODIFY COLUMN DA_TEC VARCHAR(4000) NOT NULL;




CREATE TABLE GABINETE(

	NUM_SERIE NUMERIC(6) ,
	COD_FORNECEDOR NUMERIC(3) ,
	NM_NOME VARCHAR(250) ,
    PC_PRECO NUMERIC(10,2),
    DA_TEC VARCHAR(4000)

);

INSERT INTO GABINETE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200071,203,'SHARKOON',246.20,'2LEDs');
INSERT INTO GABINETE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200072,200,'SHARKOON',246.20,'3LEDs');
INSERT INTO GABINETE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200073,201,'EATX',10046.20,'8LEDs');
INSERT INTO GABINETE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200074,201,'BLUECASE',286.27,'1LED');
INSERT INTO GABINETE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200075,201,'BLUECASE',689.20,'1LED');
INSERT INTO GABINETE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200076,203,'KAMEX',626.20,'3LEDs');
INSERT INTO GABINETE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200077,203,'KAMEX',646.20,'3LEDs');

SELECT * FROM GABINETE;

Select nome_fornecedor,num_serie,pc_preco
From gabinete m
Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;


ALTER TABLE GABINETE
ADD CONSTRAINT NUM_SERIE_PK_GABINETE PRIMARY KEY (NUM_SERIE);

ALTER TABLE GABINETE 
ADD CONSTRAINT COD_FORNECEDOR_FK_GABINETE FOREIGN KEY (COD_FORNECEDOR)
REFERENCES FORNECEDOR (COD_FORNECEDOR);

ALTER TABLE GABINETE
MODIFY COLUMN COD_FORNECEDOR NUMERIC(3) NOT NULL;

ALTER TABLE GABINETE
MODIFY COLUMN NM_NOME VARCHAR(250) NOT NULL;

ALTER TABLE GABINETE 
MODIFY COLUMN PC_PRECO NUMERIC(10,2) NOT NULL;

ALTER TABLE GABINETE 
MODIFY COLUMN DA_TEC VARCHAR(4000) NOT NULL;





CREATE TABLE MOUSE(

	NUM_SERIE NUMERIC(6) ,
	COD_FORNECEDOR NUMERIC(3) ,
	NM_NOME VARCHAR(250) ,
    PC_PRECO NUMERIC(10,2) ,
    DA_TEC VARCHAR(4000) 

);


INSERT INTO MOUSE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200031,200,'REDRAGON',646.20,'1000DPI');
INSERT INTO MOUSE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200032,202,'REDRAGON',646.20,'17000DPI');
INSERT INTO MOUSE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200033,202,'ASTRO',646.20,'2000DPI');
INSERT INTO MOUSE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200034,204,'OPTICO',686.27,'1200DPI');
INSERT INTO MOUSE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200035,203,'LOGITECH',689.20,'16000DPI');
INSERT INTO MOUSE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200036,201,'LOGITECH',686.20,'1300DPI');
INSERT INTO MOUSE (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200037,203,'REDRAGONPLUS',646.20,'5000DPI');

SELECT * FROM MOUSE;

Select nome_fornecedor,num_serie,pc_preco
From mouse m
Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;


ALTER TABLE MOUSE
ADD CONSTRAINT NUM_SERIE_PK_MOUSE PRIMARY KEY (NUM_SERIE);

ALTER TABLE MOUSE
ADD CONSTRAINT COD_FORNECEDOR_FK_MOUSE FOREIGN KEY (COD_FORNECEDOR)
REFERENCES FORNECEDOR (COD_FORNECEDOR);

ALTER TABLE MOUSE
MODIFY COLUMN COD_FORNECEDOR NUMERIC(3) NOT NULL;

ALTER TABLE MOUSE
MODIFY COLUMN NM_NOME VARCHAR(250) NOT NULL;

ALTER TABLE MOUSE 
MODIFY COLUMN PC_PRECO NUMERIC(10,2) NOT NULL;

ALTER TABLE MOUSE 
MODIFY COLUMN DA_TEC VARCHAR(4000) NOT NULL;





CREATE TABLE TECLADO(

	NUM_SERIE NUMERIC(6) ,
	COD_FORNECEDOR NUMERIC(3) ,
	NM_NOME VARCHAR(250) ,
    PC_PRECO NUMERIC(10,2) ,
    DA_TEC VARCHAR(4000) 

);

INSERT INTO TECLADO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121235,203,'RAINBOW',646.20,'RGB');
INSERT INTO TECLADO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121238,203,'RAINBOW',746.20,'RGB');
INSERT INTO TECLADO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121231,203,'MULTILASER',146.20,'RGB');
INSERT INTO TECLADO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121237,204,'MULTILASER',886.27,'RGB');
INSERT INTO TECLADO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121239,203,'VINIK',689.20,'RGB');
INSERT INTO TECLADO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121233,203,'LOGITECH',626.20,'RGB');
INSERT INTO TECLADO (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (121232,203,'LOGITECH',646.20,'RGB');

SELECT * FROM TECLADO;

Select nome_fornecedor,num_serie,pc_preco
From teclado m
Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;



ALTER TABLE TECLADO
ADD CONSTRAINT NUM_SERIE_PK_TECLADO PRIMARY KEY (NUM_SERIE);

ALTER TABLE TECLADO
ADD CONSTRAINT COD_FORNECEDOR_FK_TECLADO FOREIGN KEY (COD_FORNECEDOR)
REFERENCES FORNECEDOR (COD_FORNECEDOR);

ALTER TABLE TECLADO
MODIFY COLUMN COD_FORNECEDOR NUMERIC(3) NOT NULL;

ALTER TABLE TECLADO
MODIFY COLUMN NM_NOME VARCHAR(250) NOT NULL;

ALTER TABLE TECLADO
MODIFY COLUMN PC_PRECO NUMERIC(10,2) NOT NULL;

ALTER TABLE TECLADO
MODIFY COLUMN DA_TEC VARCHAR(4000) NOT NULL;





CREATE TABLE MONITOR(
	
    NUM_SERIE NUMERIC(6) ,
    COD_FORNECEDOR NUMERIC(3) ,
	NM_NOME VARCHAR(250) ,
    PC_PRECO NUMERIC(10,2) ,
    DA_TEC VARCHAR(4000) 


);

INSERT INTO MONITOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200081,201,'BENQ',646.20,'LED');
INSERT INTO MONITOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200082,201,'BENQ',646.20,'LED');
INSERT INTO MONITOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200083,203,'DELL',646.20,'LED');
INSERT INTO MONITOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200084,204,'ACER',686.27,'LED');
INSERT INTO MONITOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200085,202,'ACER',689.20,'LED');
INSERT INTO MONITOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200086,204,'AOC',626.20,'LED');
INSERT INTO MONITOR (NUM_SERIE,COD_FORNECEDOR,NM_NOME,PC_PRECO,DA_TEC) VALUES (200087,203,'ACERPREDATOR',646.20,'LED');

SELECT * FROM MONITOR;

Select nome_fornecedor,num_serie,pc_preco
From monitor m
Inner join fornecedor f on f.cod_fornecedor  = m.cod_fornecedor;


ALTER TABLE MONITOR
ADD CONSTRAINT NUM_SERIE_PK_MONITOR PRIMARY KEY (NUM_SERIE);

ALTER TABLE MONITOR 
ADD CONSTRAINT COD_FORNECEDOR_FK_MONITOR FOREIGN KEY (COD_FORNECEDOR)
REFERENCES FORNECEDOR (COD_FORNECEDOR);

ALTER TABLE MONITOR
MODIFY COLUMN COD_FORNECEDOR NUMERIC(3) NOT NULL;

ALTER TABLE MONITOR
MODIFY COLUMN NM_NOME VARCHAR(250) NOT NULL;

ALTER TABLE MONITOR 
MODIFY COLUMN PC_PRECO NUMERIC(10,2) NOT NULL;

ALTER TABLE MONITOR 
MODIFY COLUMN DA_TEC VARCHAR(4000) NOT NULL;



CREATE TABLE FORNECEDOR(

	COD_FORNECEDOR NUMERIC(3),
    NOME_FORNECEDOR VARCHAR(50)

);

insert into fornecedor (cod_fornecedor,nome_fornecedor) values (200,'INTEL');
insert into fornecedor (cod_fornecedor,nome_fornecedor) values (201,'AMD');
insert into fornecedor (cod_fornecedor,nome_fornecedor) values (202,'AZUS');
insert into fornecedor (cod_fornecedor,nome_fornecedor) values (203,'CHIPARTE');
insert into fornecedor (cod_fornecedor,nome_fornecedor) values (204,'DELL');
SELECT * FROM FORNECEDOR;	


insert into fornecedor (COD_FORNECEDOR,NOME_FORNECEDOR) VALUES (236,'AZUS');

ALTER TABLE FORNECEDOR
ADD CONSTRAINT COD_FORNECEDOR_PK PRIMARY KEY (COD_FORNECEDOR);

ALTER TABLE FORNECEDOR
MODIFY COLUMN NOME_FORNECEDOR VARCHAR(50) NOT NULL;

