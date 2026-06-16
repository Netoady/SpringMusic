CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(150) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE
);

CREATE TABLE artists (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    genre VARCHAR(100) NOT NULL,
    song VARCHAR(150) NOT NULL
);

CREATE TABLE events (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    date DATE NOT NULL,
    location VARCHAR(255) NOT NULL
);

CREATE TABLE votes (
    id BIGSERIAL PRIMARY KEY,
    id_user BIGINT NOT NULL,
    id_artist BIGINT NOT NULL,
    id_event BIGINT NOT NULL,
    vote_date TIMESTAMP NOT NULL,
    
    -- Configurando as chaves estrangeiras (Foreign Keys)
    CONSTRAINT fk_vote_user FOREIGN KEY (id_user) REFERENCES users(id),
    CONSTRAINT fk_vote_artist FOREIGN KEY (id_artist) REFERENCES artists(id),
    CONSTRAINT fk_vote_event FOREIGN KEY (id_event) REFERENCES events(id)
);