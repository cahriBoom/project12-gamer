import { Component, OnDestroy } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { GamerService } from './services/gamer.service';
import { takeUntil } from 'rxjs/operators';
import { Subject } from 'rxjs';
import { Gamer } from './models/gamer.model';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnDestroy {
  title = 'gamer-front';

  constructor(private gamerService: GamerService) { }

  gamerForm = new FormGroup({
    gamertag: new FormControl('', Validators.nullValidator && Validators.required),
    plateform: new FormControl('', Validators.nullValidator && Validators.required),
    server: new FormControl('', Validators.nullValidator && Validators.required),
    email: new FormControl('', Validators.nullValidator && Validators.required)
  });

  gamers: Gamer[] = [];
  gamerCount = 0;

  destroy$: Subject<boolean> = new Subject<boolean>();

  onSubmit() {
    this.gamerService.addGamer(this.gamerForm.value, this.gamerCount + 1).pipe(takeUntil(this.destroy$)).subscribe(data => {
      console.log('message::::', data);
      this.gamerCount = this.gamerCount + 1;
      console.log(this.gamerCount);
      this.gamerForm.reset();
    });
  }

  getAllGamers() {
    this.gamerService.getGamers().pipe(takeUntil(this.destroy$)).subscribe((gamers: any[]) => {
      this.gamerCount = gamers.length;
      this.gamers = gamers;
    });
  }

  ngOnDestroy() {
    this.destroy$.next(true);
    this.destroy$.unsubscribe();
  }

  ngOnInit() {
    this.getAllGamers();
  }

}
