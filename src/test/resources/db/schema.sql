/*CREATE TABLE IF NOT EXISTS account (
                                     id bigint auto_increment,
                                     name VARCHAR(255) NOT NULL default '',
                                     password_hash VARCHAR(100) default '',
                                     email VARCHAR(255) NOT NULL,
                                     phone_number VARCHAR(255) NOT NULL,
                                     photo BLOB NOT NULL,
                                     PRIMARY KEY (id),
                                     key ix_account_email (email), -- TODO use unique key
                                     key ix_account_phone_number (phone_number) -- TODO use unique key
) ENGINE=InnoDB;*/
