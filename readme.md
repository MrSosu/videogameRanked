Scrivere un programma per gestire le classifiche di una sala-giochi. In particolare, è necessario
gestire sia la classifica "locale" di ogni videogioco presente, che quella "globale". Ogni videogioco  ha  un  id
univoco, un nome e  un  coefficiente  di difficoltà (da  1  a 5).
Il piazzamento di un utente nella
classifica globale è dato dalla somma del suo piazzamento in ciascun videogioco moltiplicato per il
coefficiente di difficoltà del videogioco. Se l'utente non ha giocato ad un videogioco x, il suo
punteggio per x è 0.
Ogni utente ha un id univoco e uno username, usato per le classifiche.
Implementare le seguenti operazioni:
• inserisci utente: crea un utente
• inserisci videogioco: crea e inserisce un videogioco nel sistema
• inserisci partita: dato un utente, un videogioco e un punteggio, aggiorna le classifiche
• classifica di un videogioco: dato un videogioco, restituisce la classifica (top 3) del videogioco 
in formato username:punteggio dei primi.