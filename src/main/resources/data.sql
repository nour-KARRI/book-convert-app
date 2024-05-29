INSERT INTO language (id, code, name) VALUES(1, 'en', 'english'),(2, 'fr', 'french');

INSERT INTO kitab_ar (id, audio,title) VALUES (1, '','كِتَابُ الطَّهَارَةِ');
INSERT INTO kitab_translation (id, kitab_id, language_id, title) VALUES (1, 1, 1, 'The Book of Purificationِ'), (2, 1, 2, 'Le Livre de la Purificationِ');

INSERT INTO chapter_ar (id, kitab_id, title) VALUES (1, 1, 'بَابُ الْمِيَاهِ');

INSERT INTO chapter_translation (id, chapter_id, language_id, title) VALUES (1,1,1,'Chapter1. Water'),(2,1,2,'Chapitre 1. les eaux');