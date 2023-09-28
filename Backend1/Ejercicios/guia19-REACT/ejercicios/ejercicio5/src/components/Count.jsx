import React from 'react'
import { useState } from 'react'

const Count = () => {
    const [count, setCount] = useState(0)

    return (
        <>
            <button onClick={() => setCount((count) => count - 100)}>
                -100
            </button>
            <button onClick={() => setCount((count) => count - 10)}>
                -10
            </button>
            <button onClick={() => setCount((count) => count - 1)}>
                -1
            </button>
            <button className='contador'>
                {count}
            </button>
            <button onClick={() => setCount((count) => count + 1)}>
                +1
            </button>
            <button onClick={() => setCount((count) => count + 10)}>
                +10
            </button>
            <button onClick={() => setCount((count) => count + 100)}>
                +100
            </button>

            <br /> <br /> <br />
            <button onClick={() => setCount(0)}>
                Comenzar en 0
            </button>
        </>
    )
}

export default Count
