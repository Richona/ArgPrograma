import React, { useState, useEffect } from "react";
import { fetchCharacters } from "../services/rickAndMortyService";

const Personajes = () => {
    const [characters, setCharacters] = useState([]);

    useEffect(() => {
        async function fetchData() {
            const data = await fetchCharacters();
            setCharacters(data);
        }
        fetchData();
    }, []);

    return (
        <div>
            <h1 className="mb-5">Lista de Personajes de Rick and Morty</h1>
            <section className="d-flex justify-content-between flex-wrap row-gap-5">
                {characters.map((character) => (
                    <div className="col-3">
                        <h4 key={character.id}>{character.name}</h4>
                        <img src={character.image} alt="" />
                    </div>
                ))}
            </section>
        </div>
    )
}

export default Personajes
