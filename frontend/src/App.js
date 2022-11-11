import React, { useEffect } from "react";
import "./App.css";
import { Home } from "./pages/Home";
import { useState } from "react";
import { Route, Routes } from "react-router-dom";
import { axiosCatPictures, axiosCatData } from "./api/getCats";
import AboutPage from "./pages/AboutPage";

function App() {
  // 데이터 db로 불러오기 !
  const [cats, setCats] = useState([]);
  useEffect(() => {
    // axios 사용
    const data = axiosCatData();
    data.then((data) => setCats(data));
  }, []);

  const [ id, species ] = cats;

  // 페이지구성
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Home cats={cats}/>} />
        <Route path="about/*" element={<AboutPage cats={cats} />} />
      </Routes>
    </div>
  );
}

export default App;
