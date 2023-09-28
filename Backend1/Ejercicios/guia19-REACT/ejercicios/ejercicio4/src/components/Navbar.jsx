import React from 'react'
import { Link } from 'react-router-dom'

const Navbar = () => {
    return (
        <ul>
            <Link to="/main1">Main 1</Link>
            <span> __________ </span>
            <Link to="/main2">Main 2</Link>
        </ul>
    )
}

export default Navbar
