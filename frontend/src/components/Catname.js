import React from "react";
import { Link } from "react-router-dom";

function Catname({ cat }) {
    return (
        <div>
            <li>
                <Link to="about/{cat.id}">{cat.species}</Link>
              </li>
        </div>
    )
}

export default Catname;