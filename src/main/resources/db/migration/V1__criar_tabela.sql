CREATE TABLE tarefas (
    id SERIAL PRIMARY KEY,
    titulo TEXT NOT NULL,
    descricao TEXT NOT NULL,
    data_inicio TIMESTAMP NOT NULL,
    data_final TIMESTAMP,
    concluida BOOLEAN DEFAULT FALSE
);
