CREATE TABLE clients
(
    id         INT AUTO_INCREMENT NOT NULL,
    first_name VARCHAR(255) NULL,
    last_name  VARCHAR(255) NULL,
    email      VARCHAR(255) NOT NULL,
    phone      VARCHAR(255) NULL,
    address    VARCHAR(255) NULL,
    status     VARCHAR(255) NULL,
    created_at datetime NULL,
    CONSTRAINT pk_clients PRIMARY KEY (id)
);

ALTER TABLE clients
    ADD CONSTRAINT uc_clients_email UNIQUE (email);

CREATE TABLE invoices
(
    id                INT AUTO_INCREMENT NOT NULL,
    file_name         VARCHAR(255)       NULL,
    storage_file_name VARCHAR(255)       NULL,
    created_at        datetime           NULL,
    client_id         INT                NULL,
    CONSTRAINT pk_invoices PRIMARY KEY (id)
);

ALTER TABLE invoices
    ADD CONSTRAINT FK_INVOICES_ON_CLIENT FOREIGN KEY (client_id) REFERENCES clients (id);