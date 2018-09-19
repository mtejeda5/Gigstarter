import React, { Component } from 'react';

import styles from './Homepage.css';
import Navbar from '../../components/Navbar/Navbar';
import Jumbo from '../../components/Jumbotron/Jumbotron';
import Sections from '../../components/Sections/Sections';

class Homepage extends Component {

  render() {
    return (
      <div>
        <Navbar />
        <Jumbo />
        <Sections />
      </div>
    );
  }
}

export default Homepage;
